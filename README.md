# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation, and source snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current public source snapshot

The latest public source documentation in this repository is under:

```text
source/v1.0.16/
docs/v1.0.16/
```

Version 1.0.16 adds:

- a copyable `yt-dlp` troubleshooting command on the Download tab;
- a **Copy last yt-dlp command** button so the exact command can be pasted into Termux;
- **Move file** and **Delete file** actions in the Downloaded Media item menu;
- media-index maintenance after rename, move and delete operations;
- retained v1.0.15 domain-resolution diagnostics and diagnostic report sharing fixes.

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