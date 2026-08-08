# Alpha17 Splitter crash analysis leading to alpha18

Supplied reports recorded three unique crashes on Android 16 / API 36 at 01:36:53, 01:37:50 and 01:38:48. A fourth supplied file duplicated the 01:38:48 event.

Every crash had the same exception:

`java.lang.NullPointerException: Attempt to invoke virtual method 'float android.view.View.getZ()' on a null object reference`

The top frames were Android framework touch-dispatch methods: `ViewGroup.hasChildWithZ`, `buildOrderedChildList`, `buildTouchDispatchChildList`, `dispatchTouchEvent`, and `ScrollView.dispatchTouchEvent`.

The alpha17 slider completion callback synchronously rebuilt the Splitter range rows by calling `renderSplitterRanges()`. That function starts by removing all child views. Removing the active slider from its parent while Android is still dispatching the same pointer event can invalidate the framework's ordered touch-child list. A delayed invalid-range rollback could also rebuild the hierarchy during a long gesture.

Alpha18 eliminates those hierarchy changes from the touch path. Slider state, fields, Undo state and invalid-range rollback are updated in place.
