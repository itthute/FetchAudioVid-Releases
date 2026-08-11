# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha24** (`versionCode 20023`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha24/
source/v2.0.0-alpha24/
```

Alpha24 extends the normal Video downloader for LinkedIn videos the user owns or is authorised to save, while keeping the installed `yt-dlp` extractor as the first choice:

- ordinary LinkedIn and `lnkd.in` Video jobs run the normal yt-dlp LinkedIn extractor first;
- if yt-dlp produces no media and reports a recognized LinkedIn extraction-layout failure, the app automatically invokes a local fallback;
- the fallback understands classic `<video data-sources>` markup plus newer LinkedIn JSON media metadata stored in `<code>` elements;
- it can locate progressive MP4, HLS and DASH candidates and then hands the chosen stream back to yt-dlp for the existing download/post-processing pipeline;
- retained LinkedIn Netscape cookies are used when the target post requires the user's authenticated browser session; the fallback does not bypass login or access controls;
- temporary signed LinkedIn CDN URLs stay in owner-only Termux job files, are filtered from normal diagnostics and are deleted after the fallback attempt;
- duplicate prevention, optional H.264/AAC phone-editor compatibility, media indexing, playback/share, Media Library, Splitter and Converter handoffs are retained;
- **Help / complete user guide** is now an 18-section task-oriented manual covering setup, every download mode, LinkedIn video, cookies, Pictures-to-PDF, Media Library, Splitter, Converter, metadata editing, maintenance, updates/rollback, diagnostics, troubleshooting, issue/crash reporting, security/privacy and activation;
- Help adds **Copy guide** and **Share diagnostics** actions;
- alpha23's picture-aware post-download controls and Pictures-to-PDF utility remain intact;
- alpha18's Android 16 Splitter touch-dispatch safety invariant remains protected by regression tests.

Verified signed build identity:

```text
APK SHA-256:        961da46109e216e142577a3b60035ab8e41c17096e753ba6e3e0c8bf7548a092
Unsigned SHA-256:   1f175bdc95f6decc962f096241836f1f527665a11a1a0a5f34948b3173fda1cf
Signer SHA-256:     9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
Source ZIP SHA-256: 76ffd5dbe4044b4b966fdd8ee46e0ecf436158cb68bbffa78a24d9ea8284567a
Alpha23→24 patch:   914db7eeb0a66d7a163134432d4068c572c4f8e0a9f1ab56baf8680e039776cf
```

The clean Android API 28 / Build Tools 28.0.3 build and the expanded regression suite pass, including `LinkedInVideoSupportTest`, Pictures-to-PDF/social-picture checks, cookie/URL/activation/Splitter checks, Java syntax validation and source regression guards.

A deliberately unsigned alpha24 practice APK was also produced privately for the documented signing-practice workflow; the unsigned binary is not committed to this public repository. No alpha24 binary GitHub Release asset is claimed by this documentation update.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha24 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha24.example.json`.

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
