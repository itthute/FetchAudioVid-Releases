# ITthute Fetch AudioVid Releases

Public release repository for **ITthute Fetch AudioVid**.

This repository contains public release metadata, documentation and source-change snapshots for the Android application package:

```text
za.co.itthute.fetchaudiovid
```

## Current v2 test build documentation

The latest documented test build is **v2.0.0-alpha26** (`versionCode 20025`).

Documentation and source-change notes are under:

```text
docs/v2.0.0-alpha26/
source/v2.0.0-alpha26/
```

Alpha26 adds two usability/safety improvements while preserving the successful alpha25 LinkedIn Video remediation:

- the Download tab can show privacy-safe **cookie profile insights** for the independently retained Facebook, Instagram and LinkedIn profiles;
- profile summaries include app-recorded import time and retained age, while a refreshed inspection can show record/domain totals, session/persistent counts, expired-record count, Secure/HttpOnly counts and future-expiry bounds without exposing cookie names or values;
- the profile selected for the current URL is identified so users can see which retained authentication context will be used;
- Pictures-to-PDF now proposes the **parent folder of the source-picture folder** as its default output target;
- users may type a different shared-storage target or browse to a target through Android's Storage Access Framework;
- optional source-folder cleanup is available only after the PDF has been written, reopened and verified, and every selected source picture has been included;
- when cleanup is selected, the app rejects the source folder itself and every descendant of that source as an output target, preventing the completed PDF from being deleted with its inputs;
- a skipped/undecodable picture or provider deletion error keeps the source directory intact;
- alpha25 LinkedIn Video behavior, alpha23 picture-post/PDF workflow, alpha22 independent social-cookie profiles, targeted Android media publication and the alpha18 Android 16 Splitter touch-safety invariant remain preserved.

Verified build identity:

```text
APK SHA-256:        013dee89d0787f20f7a812e0f50f657842b87682741f23b7d2264e0e09955212
Unsigned SHA-256:   c86865bfc1c1bdafc7ff688dcb9bb5b76e0a26cc2aee6fc2577718c08747eb4b
Signer SHA-256:     9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
Source ZIP SHA-256: bd1cf9543a96f3407235a91235048ddbf9bee35778cac6593686fb4017b1b7e5
Alpha25→26 patch:   6e7156e10ec2ce3a88d0bba1be07a1cd6f3747f87734a4f5a7c014c1d571ddd4
```

The clean Android API 28 / Build Tools 28.0.3 build passes. The complete regression suite also passes, including cookie/profile, Pictures-to-PDF, LinkedIn Video, social-picture, URL/activation/Splitter, Java syntax and source-regression checks.

A deliberately unsigned alpha26 practice APK was produced privately for the documented signing-practice workflow; the unsigned binary is not committed to this public repository. No alpha26 binary GitHub Release asset is claimed by this documentation update.

## Live update feed

The Android app reads its production update feed from:

```text
https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json
```

Because v2.0.0-alpha26 is an alpha/test build, this repository update **does not change the live production `update.json`**. A reviewed alpha manifest template is available as `update-v2.0.0-alpha26.example.json`.

Do not point the live `update.json` at a new APK until the intended release channel is confirmed, the APK release asset is actually available, its SHA-256 is verified, and the signer is confirmed.

## Security rules

Never commit:

- release keystores;
- private signing bundles;
- signing passwords;
- administrator plaintext credential files;
- Facebook/Instagram/LinkedIn/browser cookies;
- cookie names/values copied from a browser profile;
- temporary signed LinkedIn CDN media URLs;
- private diagnostic reports containing device/user paths or active session details;
- user media files.

The public source documentation never contains the private signing password.