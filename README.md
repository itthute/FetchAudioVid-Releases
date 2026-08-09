# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha19** (`versionCode 20018`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha19/
source/v2.0.0-alpha19/
```

Alpha19 adds a targeted, best-effort secondary media-publication step through Termux after completed media operations:

- Android `MediaScannerConnection` remains the primary indexing mechanism;
- the optional secondary step calls `termux-media-scan` with the **exact final media path(s)** only;
- completed downloads, conversions and metadata edits trigger the secondary scan after the Android scan completes;
- Splitter outputs are scanned together as one exact-path batch;
- rename/move refreshes old and new paths, while delete refreshes the removed path to help clear stale MediaStore entries;
- no recursive scan of `/storage/emulated/0`, `~/storage/shared`, or an entire destination tree is performed;
- missing Termux:API, a missing `termux-media-scan` command, timeouts or scan failures are diagnostic information only and never turn a successful media operation into an application failure;
- Diagnostics records the latest targeted Termux media-scan status, reason, file count, return code and time.

Alpha19 retains alpha18's Android 16 Splitter touch-dispatch crash fix and all earlier Download, Media Library, Splitter, Converter, reporting, Help and Contact Us improvements.

Verified build identity:

```text
APK SHA-256:    0e503e3ad1f8eb59b02b1d71728a08ae065e02a913714ba011b87d8f579f8340
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha19 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest is available as `update-v2.0.0-alpha19.example.json`.

Do not point the live `update.json` at a new APK until the intended release channel is confirmed, the APK release asset is available, its SHA-256 is verified, and the signer is confirmed.

## Security rules

Never commit:

- release keystores;
- private signing bundles;
- signing passwords;
- administrator plaintext credential files;
- Facebook/Instagram/browser cookies;
- private diagnostic reports containing device/user paths or active session details;
- user media files.

The public source package embeds only administrator password hashes, not plaintext administrator passwords.
