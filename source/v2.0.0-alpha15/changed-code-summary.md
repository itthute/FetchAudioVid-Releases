# v2.0.0-alpha15 changed-code summary

## Splitter output destination
- Adds an `ACTION_OPEN_DOCUMENT_TREE` request for choosing the splitter output directory.
- Retains read/write URI permission when available.
- Resolves supported Android document-tree URIs to filesystem paths for Termux/FFmpeg.
- Remembers the last custom splitter output directory.

## Editable text contrast
- Adds a shared editable-field styling helper.
- Applies readable dark-theme text, hint, background and border colours to programmatically created text fields, including metadata editing.

## Splitter range editing
- Adds per-range locked state and previous-range state.
- Adds Lock/Unlock and Undo buttons.
- Delays slider drag until a horizontal gesture exceeds a movement threshold.
- Allows vertical gestures to remain page-scroll gestures instead of immediately moving a range handle.

## Download completion workflow
- Renames the playback action to `Playback downloaded media`.
- Adds completed-file shortcuts to Media Library, Splitter and Converter.
- Media Library navigation can highlight the completed file.

## Diagnostic fixes
- Repairs stale Splitter/Converter paths to a completed same-stem output when yt-dlp removed an intermediate post-processing file.
- Adds Media Library request-generation tokens to suppress stale watchdogs/results.
- Corrects single-file media scans so they do not fall back to or overwrite the previous batch scan list.

## Version
- Manifest / build version: `2.0.0-alpha15`
- Version code: `20014`
