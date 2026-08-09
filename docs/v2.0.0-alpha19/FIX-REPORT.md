# v2.0.0-alpha19 implementation report

Implemented a targeted, scalable secondary media refresh path.

- Added `TermuxBridge.TYPE_MEDIA_PUBLISH` as a quiet background request type.
- Added exact-path `termux-media-scan` invocation with shell quoting and de-duplication.
- Added an optional 25-second command timeout.
- Missing `termux-media-scan`, missing Termux/RUN_COMMAND, or a scan failure is recorded but remains non-fatal.
- Download/converter/metadata flows trigger the secondary scan after the primary Android media scan completes.
- Splitter scans all newly generated clips as one targeted batch.
- Rename/move scans old and new paths; delete scans the deleted path to help remove stale MediaStore records.
- Diagnostics persists the latest secondary-scan outcome even when the Activity is not active.
- Added alpha19 regression guards preventing accidental recursive shared-storage scans.
