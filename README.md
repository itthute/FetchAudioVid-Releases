# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha22** (`versionCode 20021`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha22/
source/v2.0.0-alpha22/
```

Alpha22 is a focused reliability update for Facebook and LinkedIn Picture/Post Images after alpha21 field diagnostics identified three application-side problems:

- imported website cookies were retained in one global `cookies.txt`, so importing another platform replaced the previous platform's session;
- Facebook `/share/...` URLs could remain unresolved after an HTTP 400 response and were then rejected by gallery-dl as unsupported;
- LinkedIn `lnkd.in` short links were rejected by Picture-mode URL classification before the LinkedIn extractor could run.

Alpha22 therefore:

- retains independent Facebook, Instagram and LinkedIn Netscape cookie profiles with owner-only permissions;
- automatically selects the matching platform profile while retaining the legacy generic cookie file only as a migration fallback;
- adds a second Facebook share-link resolution path using yt-dlp redirect discovery when the HTTP resolver cannot canonicalise the URL;
- accepts `lnkd.in` as LinkedIn Picture-mode input and lets the built-in LinkedIn extractor follow the redirect;
- expands Diagnostics with per-platform cookie-profile state and selected-profile information without exposing cookie values;
- preserves alpha20/21 ordered picture sub-folders, zero-padded numbering, optional `post-info.txt`, retry behavior and Instagram extraction;
- preserves alpha19 targeted media publication and alpha18's Android 16 Splitter touch-dispatch safety invariant.

Verified signed build identity:

```text
APK SHA-256:    910c7401640543b5dac2f827a48fbace7993c702dce006bc7ee3bf5b11a4e349
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

A deliberately unsigned alpha22 practice APK was also produced privately for signing practice; the unsigned binary is not committed to this public repository.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha22 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha22.example.json`.

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
