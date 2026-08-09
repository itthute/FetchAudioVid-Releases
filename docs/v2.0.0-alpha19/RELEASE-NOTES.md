# ITthute Fetch AudioVid v2.0.0-alpha19

Alpha19 adds targeted secondary media publication through Termux after completed media operations.

## Media indexing improvement

Android `MediaScannerConnection` remains the primary indexing mechanism. After it has refreshed completed download/conversion/metadata files, alpha19 also submits a best-effort `termux-media-scan` command for the exact final path(s) only.

Splitter output clips are scanned as one targeted batch. Rename/move scans the old and new paths, and delete scans the removed path so stale MediaStore entries can be cleared.

The secondary scan never recursively scans `/storage/emulated/0`, `~/storage/shared`, or an entire destination tree. It uses a 25-second timeout where available and never changes a successful media operation into a failure if Termux:API is missing or the scan fails.

Diagnostics now records the latest targeted Termux media-scan status, reason, file count, return code and time.
