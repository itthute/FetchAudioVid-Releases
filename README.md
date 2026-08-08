# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha18** (`versionCode 20017`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha18/
source/v2.0.0-alpha18/
```

Alpha18 is a critical Splitter stability update. Four supplied alpha17 crash reports showed the same Android 16 main-thread `ViewGroup.getZ()` null-pointer failure while slider touch events were being dispatched. Alpha17 could rebuild/remove the Splitter range child views synchronously from `ACTION_UP` / `ACTION_CANCEL`, and its delayed invalid-range rollback could also rebuild those views during a long gesture.

Alpha18 fixes this by:

- never removing/rebuilding Splitter range views from slider touch callbacks;
- updating slider values, time fields and Undo state in place;
- reverting invalid slider moves in place after release instead of using a delayed hierarchy rebuild;
- adding a regression guard that fails if a future slider callback reintroduces `renderSplitterRanges()` during touch dispatch.

Alpha18 retains alpha17's 90-second default divider, clip lock/undo model, app usage/crash reporting, expanded Help and Contact Us, plus all earlier download, Media Library, Splitter and Converter improvements.

Verified build identity:

```text
APK SHA-256:    246c3dc02e15890648edf37e4687e108872be9fc14ed58ad063ed75d86b97994
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha18 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest is available as `update-v2.0.0-alpha18.example.json`.

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
