# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha20** (`versionCode 20019`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha20/
source/v2.0.0-alpha20/
```

Alpha20 adds a dedicated **Pictures (post/carousel images)** mode for Facebook, Instagram and LinkedIn posts:

- each picture job creates a post-specific sub-folder inside the user-selected target directory;
- images use zero-padded ordered names such as `001.jpg`, `002.jpg`, `003.jpg` so filename sorting preserves post/carousel order;
- completed numbered files are retained on retry rather than being overwritten unnecessarily;
- optional `post-info.txt` records post provenance and download details;
- Facebook and Instagram use `gallery-dl` with the app's existing cookie support when authentication is needed;
- LinkedIn uses a built-in best-effort Python image extractor because provider markup can change independently of the app;
- completed pictures are published with Android `MediaScannerConnection` plus alpha19's exact-path, best-effort `termux-media-scan` secondary pass;
- Diagnostics, dependency setup/repair and troubleshooting now understand `gallery-dl` and picture jobs.

Alpha20 retains alpha19's targeted media-publication design and alpha18's Android 16 Splitter touch-dispatch crash fix, including the invariant that Splitter range views are not rebuilt during active slider touch dispatch.

Verified signed build identity:

```text
APK SHA-256:    85c4823eaef7ca98cad2d44a49ccaad9decad6f1944d6cbafe6225cb9d7d8693
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

The alpha20 release work also produced a deliberately unsigned practice APK for private signing practice; the unsigned binary is not committed to this public repository.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha20 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha20.example.json`.

Do not point the live `update.json` at a new APK until the intended release channel is confirmed, the APK release asset is actually available, its SHA-256 is verified, and the signer is confirmed.

## Security rules

Never commit:

- release keystores;
- private signing bundles;
- signing passwords;
- administrator plaintext credential files;
- Facebook/Instagram/LinkedIn/browser cookies;
- private diagnostic reports containing device/user paths or active session details;
- user media files.

The public source documentation never contains the private signing password.
