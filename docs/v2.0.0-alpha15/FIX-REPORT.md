# ITthute Fetch AudioVid v2.0.0-alpha15 Fix Report

## Requested improvements

- **Browse to target folder** in the Splitter save dialog via Android's folder picker.
- Shared high-contrast styling for editable text fields in dark theme.
- Per-range **Lock / Unlock** and **Undo last slider move** controls.
- Splitter slider gesture detection that distinguishes deliberate horizontal dragging from vertical page scrolling.
- Completed-download shortcuts to Media Library, Splitter and Converter.
- Renamed **Open downloaded media** to **Playback downloaded media**.

## Bugs found in alpha14 diagnostics

### Temporary yt-dlp file became stale
The diagnostics showed a `.webm` selected in Media Library and sent to Splitter while an audio download was still being post-processed. yt-dlp later generated the final `.mp3` and deleted the `.webm`, causing FFmpeg to fail with a missing input. Alpha15 repairs stale Splitter/Converter paths to the completed same-stem file and rechecks immediately before editing.

### Media Library timeout/result race
Overlapping Media Library requests could leave an older timeout watchdog or result able to affect the current request. Alpha15 tags listing requests with generation tokens and ignores stale timeouts/results.

### Single-file media refresh reused old batch
A metadata save for one file could trigger refresh of the previous multi-file scan list. Alpha15 recognises a single storage path directly and prevents one-off scans from replacing the batch-list preference.

The diagnostics also contained an extractor-specific Facebook parse failure and a PyPI read-timeout retry that later recovered; these were not treated as evidence of a Java application crash.
