# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha15** (`versionCode 20014`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha15/
source/v2.0.0-alpha15/
```

Alpha15 adds:

- **Browse to target folder** from the Splitter save dialog;
- high-contrast styling for editable text fields in dark theme;
- per-clip **Lock / Unlock** and **Undo last slider move** controls plus safer vertical scrolling over Splitter range bars;
- completed-download shortcuts to **Media Library**, **Splitter** and **Converter**;
- the renamed **Playback downloaded media** action;
- automatic repair of Splitter/Converter paths when yt-dlp replaces a temporary media file during post-processing;
- Media Library request-generation tokens to prevent stale timeout/result races;
- a fix for one-file Android media refreshes accidentally reusing the previous batch list.

Verified build identity:

```text
APK SHA-256:    943cbbae3dc6bb5049bc9f2f0dd4afb91e1c55b4bd89af786bda4167b9fdc70c
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha15 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest is available as `update-v2.0.0-alpha15.example.json`.

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
