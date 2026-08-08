# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha17** (`versionCode 20016`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha17/
source/v2.0.0-alpha17/
```

Alpha17 adds:

- smoother **Undo last slider move** behaviour using gesture-level begin/commit state, so taps and vertical scrolling do not overwrite a useful undo point;
- **90 seconds** as the default Splitter divider duration, while retaining 30, 60, 90 and custom options;
- explanatory labels/help text in **Splitter settings**;
- a privacy-conscious, user-reviewed **Send app usage report** feature in Diagnostics;
- locally captured critical crashes with a next-launch **Send crash report / Keep for later / Discard** workflow and a Diagnostics re-open action;
- a comprehensive task-oriented Help guide covering the app's current features;
- Contact ITthute actions in About for **information@ITthute.Africa** and **https://ITthute.Africa**.

Alpha17 retains alpha16 post-download sharing and troubleshooting-command popup, alpha15 Splitter output-folder browsing, high-contrast dark-theme editable fields, clip locking, safer slider scrolling, post-download editor shortcuts, yt-dlp temporary-file path repair and Media Library request-generation protection.

Verified build identity:

```text
APK SHA-256:    07ff342cf0ea14a8f6cd6e4e09cda5fddecac63af45a85772c8a20565ee0e8cd
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha17 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest is available as `update-v2.0.0-alpha17.example.json`.

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
