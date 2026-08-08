# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha16** (`versionCode 20015`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha16/
source/v2.0.0-alpha16/
```

Alpha16 adds:

- **Share downloaded media** after a download and all yt-dlp post-processing have completed successfully;
- a compact **Troubleshooting command** button instead of the large always-visible command block;
- a troubleshooting popup with **Copy command**, **Copy & open Termux**, and **Share command** actions;
- a manual-safety design where **Copy & open Termux** copies the exact command and opens Termux but does not execute it automatically.

Alpha16 retains alpha15 Splitter output-folder browsing, high-contrast dark-theme editable fields, clip lock/undo controls, safer slider scrolling, post-download Media Library/Splitter/Converter shortcuts, yt-dlp temporary-file path repair and Media Library request-generation protection.

Verified build identity:

```text
APK SHA-256:    162dd0371f39b32d45230942a169dde710fae9fca9ef6c5f10c947b013cde920
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha16 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest is available as `update-v2.0.0-alpha16.example.json`.

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
