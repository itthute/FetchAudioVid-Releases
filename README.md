# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha23** (`versionCode 20022`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha23/
source/v2.0.0-alpha23/
```

Alpha23 follows successful Facebook, Instagram and LinkedIn picture-post field testing and focuses on picture-oriented workflow improvements:

- after a picture-post download, the primary completion action is **Open downloaded picture folder** so a multi-picture post can be viewed as a set;
- audio/video-specific completion controls such as Media Library handoff, Splitter, Converter, Locate and single-file Share are hidden for picture jobs and restored for later audio/video jobs;
- adds a **Create PDF from picture folder** utility in Tools;
- uses Android's Storage Access Framework to select the source folder and create the PDF in that same folder;
- sorts source pictures in natural filename-number order (`1`, `2`, `10`; zero-padded `001`, `002`, `010` also works);
- places one picture per PDF page, automatically choosing portrait or landscape orientation and preserving image aspect ratio without cropping;
- skips undecodable images without aborting an otherwise valid PDF job and reports the result;
- preserves alpha22 independent Facebook/Instagram/LinkedIn cookie profiles, Facebook share-link fallback resolution and LinkedIn `lnkd.in` support;
- preserves alpha18's Android 16 Splitter touch-dispatch safety invariant.

Verified signed build identity:

```text
APK SHA-256:      2365bfeb9d11394d1cc5a94f56e4849c5d9474cec965efad349435308840e8ce
Unsigned SHA-256: f20157664f5e6ce27471b5e1e0ddafd0e99e5ede385fa5fb2ced53e20bedc04f
Signer SHA-256:   9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
Source ZIP SHA-256: 7d7909ca25457b6b23896562baa18bc2e6116c5887b83c8bbf37522ba26e1369
Alpha22→23 patch:  6e8fb622450637d83640453b030d2aefb0b66423e557c0a2c980d5fb8f8c30db
```

A deliberately unsigned alpha23 practice APK was also produced privately for the documented signing-practice workflow; the unsigned binary is not committed to this public repository.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha23 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha23.example.json`.

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
