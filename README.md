# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha14** (`versionCode 20013`).

Documentation and source-change artifacts are under:

```text
docs/v2.0.0-alpha14/
source/v2.0.0-alpha14/
```

Alpha14 adds:

- **Edit in Splitter** from Media Library, loading the selected file and switching directly to Splitter;
- one **Playback split** button per generated split after export;
- **Edit in Converter** from Media Library, loading the selected file and switching directly to Converter;
- **Diagnostics** in the main menu even when the Diagnostics navigation icon is hidden;
- Facebook numeric-leading long-filename reduction, including removal of the views/reactions prefix and 13+ digit runs.

Verified build identity:

```text
APK SHA-256:    9546c93d3e8a2888cfd708022ea69aa6afdde4708a69be5f83794957874fb23c
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha14 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest is available as `update-v2.0.0-alpha14.example.json`.

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
