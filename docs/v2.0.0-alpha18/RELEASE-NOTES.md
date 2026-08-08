# ITthute Fetch AudioVid v2.0.0-alpha18

Alpha18 fixes the Android 16 Splitter touch-dispatch crash reported from alpha17.

Four supplied crash reports showed the same main-thread `java.lang.NullPointerException` in Android `ViewGroup.hasChildWithZ()` / `buildTouchDispatchChildList()` while a Splitter slider gesture was being dispatched.

## Root cause

Alpha17 could call `renderSplitterRanges()` synchronously from the slider `ACTION_UP` / `ACTION_CANCEL` completion callback. `renderSplitterRanges()` removes all Splitter range child views and reconstructs them. Android 16 could still be traversing that child list for the same touch event. The delayed invalid-range rollback had the same structural risk during a long gesture.

## Fix

- Slider movement and completion now update existing widgets in place.
- No Splitter hierarchy rebuild occurs from the slider touch callbacks.
- Invalid moves revert in place after release rather than through a delayed rebuild.
- Undo enabled state is updated directly on the existing row.
- A source regression guard prevents future touch callbacks from reintroducing the unsafe rebuild.

All alpha17 features are retained.
