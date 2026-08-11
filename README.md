# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha25** (`versionCode 20024`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha25/
source/v2.0.0-alpha25/
```

Alpha25 is a field-test correction to alpha24's LinkedIn Video fallback. Alpha24 diagnostics showed that the retained LinkedIn cookie profile was valid and could fetch LinkedIn picture posts with HTTP 200, while LinkedIn Video fallback jobs still stopped with `LINKEDIN_AUTH_REQUIRED=1`. The root cause was an over-broad fallback heuristic that treated incidental words such as `authwall` or `sign in to LinkedIn` anywhere in otherwise usable LinkedIn HTML as proof of authentication failure.

Alpha25 changes that flow so that:

- normal installed `yt-dlp` remains the first LinkedIn Video attempt;
- the fallback uses the retained LinkedIn cookie profile and a browser-like LinkedIn request context;
- classic video markup and JSON metadata in both `<code>` and `<script>` elements are scanned for progressive MP4, HLS and DASH candidates **before** authentication is classified;
- incidental auth/login wording in LinkedIn scripts/navigation no longer causes a false authentication failure;
- authentication-required is reserved for strong evidence such as an actual LinkedIn login/authwall/checkpoint redirect or a real login form when no media candidate was found;
- temporary signed LinkedIn CDN URLs remain private, filtered from normal diagnostics and deleted after use;
- alpha24's expanded Help guide, alpha23 Pictures-to-PDF/picture-aware actions, alpha22 independent social-cookie profiles and alpha18 Android 16 Splitter touch-safety invariant remain preserved.

Verified build identity:

```text
APK SHA-256:        b933458e95f42d7d345410a7804a58a89f68bd2b9dcc189df9e72df851a0239c
Unsigned SHA-256:   8da0ee291264e3337d46e4b1fa1b1242d5d122107e3b085749a838d74581be1d
Signer SHA-256:     9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
Source ZIP SHA-256: e68107f9e81334a1599bca4d5a8f9db7ebee03446e7ff28ebe6a99517bfc6a02
Alpha24→25 patch:   5f6c055b178f18d5a5f708b301c8e1b027639e27f741fbf88c8b7d18bdca6fc0
```

The clean Android API 28 / Build Tools 28.0.3 build passes. The regression suite also passes, including `LinkedInVideoSupportTest`, the new `LinkedInFallbackBehaviorTest`, Pictures-to-PDF/social-picture checks, cookie/URL/activation/Splitter checks, Java syntax validation across 22 files and source regression guards.

A deliberately unsigned alpha25 practice APK was produced privately for the documented signing-practice workflow; the unsigned binary is not committed to this public repository. No alpha25 binary GitHub Release asset is claimed by this documentation update.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha25 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha25.example.json`.

Do not point the live `update.json` at a new APK until the intended release channel is confirmed, the APK release asset is actually available, its SHA-256 is verified, and the signer is confirmed.

## Security rules

Never commit:

- release keystores;
- private signing bundles;
- signing passwords;
- administrator plaintext credential files;
- Facebook/Instagram/LinkedIn/browser cookies;
- temporary signed LinkedIn CDN media URLs;
- private diagnostic reports containing device/user paths or active session details;
- user media files.

The public source documentation never contains the private signing password.
