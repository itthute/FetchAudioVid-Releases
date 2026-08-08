# v2.0.0-alpha14 changed-code summary

## Version identity

- `APP_VERSION` / manifest version name updated to `2.0.0-alpha14`.
- Android version code updated to `20013`.

## Media Library handoff actions

The Media Library item popup menu now exposes:

- **Edit in Splitter**
- **Edit in Converter**

Both actions validate the selected shared-storage media path, assign it to the relevant editor state, clear stale result state, switch to the target tab, and start the normal media-probe flow.

## Splitter playback verification

A dedicated Splitter playback container is rendered below the split/export progress area. After a successful export, the generated output paths are persisted and the UI renders one **Playback split N** button per output file. Selecting a playback button opens that exact generated media file through the app's existing media-opening flow.

The latest generated split list is restored when the Splitter view is recreated and is cleared when a different source file or new split job replaces the previous result set.

## Main-menu Diagnostics access

The top-right application menu explicitly includes **Diagnostics**. This route uses the same tab-navigation mechanism as the normal Diagnostics navigation icon, which keeps the screen reachable even when Diagnostics is excluded from the configurable visible navigation bar.

## Facebook long-filename reducer

The download worker now records whether the requested URL is Facebook (`facebook.com` or `fb.watch`). For Facebook downloads only, a post-download reducer is applied when:

1. the filename stem starts with a numeric character;
2. the stem contains more than 30 alphanumeric characters; and
3. a reactions marker is present.

The reducer recognises both the human-readable ` reactions | ` form and the `_reactions_` form produced by `yt-dlp --restrict-filenames`. It removes everything through the reactions marker, removes every run of 13 or more consecutive digits, trims redundant separators, and uses `_2`, `_3`, and so on if the reduced filename would collide with an existing file.

The media-index path is updated to the reduced filename so later Media Library, duplicate-detection and Android media-refresh operations continue to reference the renamed file.

## Regression coverage

Alpha14 validation includes checks for the new Media Library actions, tab handoff, splitter playback controls, main-menu Diagnostics route, Facebook trigger conditions, both reactions-marker forms, 13+ digit removal, collision handling, package/version identity and Java syntax across the application source.
