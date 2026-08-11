# ITthute Fetch AudioVid v2.0.0-alpha25

Version code: `20024`  
Package: `za.co.itthute.fetchaudiovid`

## Purpose of this build

Alpha25 fixes a false authentication diagnosis in alpha24's LinkedIn Video fallback. Field diagnostics showed that the retained LinkedIn cookie profile was configured and the same profile could fetch LinkedIn picture posts with HTTP 200, yet fallback video jobs stopped immediately with `LINKEDIN_AUTH_REQUIRED=1`.

The alpha24 fallback was checking for broad text fragments such as `authwall` and `sign in to LinkedIn` before it scanned the returned page for video metadata. LinkedIn can include those words in ordinary scripts/navigation even on a usable post page.

## Alpha25 correction

The fallback now:

1. uses the retained LinkedIn Netscape cookie profile and browser-like LinkedIn request headers;
2. follows redirects and retains final URL/status information internally;
3. scans classic `<video data-sources>` markup plus JSON metadata in `<code>` and `<script>` elements;
4. discovers progressive MP4, HLS and DASH candidates before authentication classification;
5. ignores incidental auth/login wording when video metadata is present;
6. reports authentication-required only for strong LinkedIn login/authwall/checkpoint redirect or real login-form evidence when no video candidate was found;
7. retains alpha24's privacy controls for temporary signed LinkedIn CDN URLs.

A behavioral regression test deliberately serves misleading `authwall` / `sign in to LinkedIn` wording together with valid `progressiveStreams` metadata and requires extraction to continue. A separate genuine login form must still be classified as authentication-required.

## Verified identities

```text
Signed APK SHA-256:   b933458e95f42d7d345410a7804a58a89f68bd2b9dcc189df9e72df851a0239c
Unsigned APK SHA-256: 8da0ee291264e3337d46e4b1fa1b1242d5d122107e3b085749a838d74581be1d
Signer SHA-256:       9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
Source ZIP SHA-256:   e68107f9e81334a1599bca4d5a8f9db7ebee03446e7ff28ebe6a99517bfc6a02
Alpha24→25 patch:     5f6c055b178f18d5a5f708b301c8e1b027639e27f741fbf88c8b7d18bdca6fc0
```

The signed APK verifies with APK Signature Scheme v2, one RSA-4096 signer, and the retained 2026-v2 ITthute certificate.

## Test status

The clean Android API 28 / Build Tools 28.0.3 build passes. The local suite passes:

- LicensePolicyTest
- ActivationScenarioTest
- MediaUrlPolicyTest
- CookieFilePolicyTest
- ClipRangeRulesTest
- PostPictureSupportTest
- PicturePdfSupportTest
- LinkedInVideoSupportTest
- LinkedInFallbackBehaviorTest
- JavaSyntaxCheck (22 files)
- source_regression_test

## Production updater

Alpha25 is a test build. The production `update.json` is intentionally unchanged.

No alpha25 binary GitHub Release asset is claimed by this documentation entry.
