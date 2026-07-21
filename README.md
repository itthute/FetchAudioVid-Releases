# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation, and source snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current public source snapshot

The latest public source documentation in this repository is under:

```text
source/v1.0.13/
docs/v1.0.13/
```

Version 1.0.13 adds:

- optional website-login cookie import for restricted Instagram/Facebook-style pages;
- rejection of non-media URLs such as update feeds, JSON, ZIP, APK, PDF and Office documents;
- Android 16 foreground-service handling for Termux RUN_COMMAND;
- clearer yt-dlp failure messages and diagnostics;
- regression tests for cookie validation, URL validation, duplicate handling, empty-output handling, HTTP 403 retry, MediaStore URI handling and activation rules.

## Live update feed

The Android app reads its update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Do not point the live `update.json` at a new APK until the matching APK asset is available at the URL shown in the manifest and its SHA-256 has been verified.

## Security rules

Never commit:

- release keystores;
- private signing bundles;
- signing passwords;
- administrator plaintext credential files;
- Facebook/Instagram/browser cookies;
- private diagnostic reports containing device/user paths or active session details.

The public source package embeds only administrator password hashes, not the plaintext administrator password.
