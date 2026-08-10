# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha21** (`versionCode 20020`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha21/
source/v2.0.0-alpha21/
```

Alpha21 is a focused remediation for the Facebook, Instagram and LinkedIn Picture/Post Images failures observed during alpha20 testing:

- fixes the alpha20 picture-job log polling defect so Diagnostics follows the real `LOG=` path and surfaces the actual `pictures-<job>.log` tail;
- adds Facebook share-link canonicalisation before gallery extraction, including redirect-style `/share/p/...` URLs;
- reuses imported Netscape cookies during Facebook resolution/extraction when enabled;
- classifies authentication/login, HTTP 403, HTTP 429/rate-limit, unsupported URL and zero-image failures with platform-specific guidance;
- hardens the built-in LinkedIn extractor to detect login/authwall/checkpoint responses instead of silently treating them as zero-image posts;
- persists the installed `gallery-dl` version after dependency setup/verification so Diagnostics no longer remains `unknown` after a successful check;
- retains alpha20 ordered post folders, `001`, `002`, `003` naming, optional `post-info.txt`, retry behavior and picture media publication;
- retains alpha19 targeted media publication and alpha18's Android 16 Splitter touch-dispatch safety invariant.

Social platforms may still require current authenticated browser cookies for old/restricted posts, and provider page structures can change independently of the app. Alpha21 is designed to make those cases visible and diagnosable rather than hiding the extractor output.

Verified signed build identity:

```text
APK SHA-256:    01a145f15e1435dbe90aec989cc223069533d7ce266703b478fdd9acd18e32fa
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

A deliberately unsigned alpha21 practice APK was also produced privately for signing practice; the unsigned binary is not committed to this public repository.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha21 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha21.example.json`.

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
