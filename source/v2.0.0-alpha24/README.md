# Source-change snapshot — v2.0.0-alpha24

This folder documents the source changes represented by the private/full alpha23→alpha24 patch and source archive retained for ITthute Fetch AudioVid.

## Identity

```text
Package: za.co.itthute.fetchaudiovid
Version name: 2.0.0-alpha24
Version code: 20023
Minimum SDK: 26
Target SDK: 28
Compile SDK: 28
```

Source ZIP SHA-256:

```text
76ffd5dbe4044b4b966fdd8ee46e0ecf436158cb68bbffa78a24d9ea8284567a
```

Full alpha23→alpha24 patch SHA-256:

```text
914db7eeb0a66d7a163134432d4068c572c4f8e0a9f1ab56baf8680e039776cf
```

## Main changes

- Adds `LinkedInVideoSupport.java` for LinkedIn URL/activity recognition, known extractor-failure recognition and the built-in fallback payload.
- Extends the Video download orchestration so normal yt-dlp always runs first and the fallback activates only when a LinkedIn job produces no file with a recognized extractor-layout failure.
- The fallback can inspect classic LinkedIn video markup and newer code-block JSON for progressive MP4, HLS or DASH media candidates.
- Uses the retained LinkedIn cookie profile only when the user has enabled imported cookies; authentication/access controls are not bypassed.
- Keeps temporary signed LinkedIn CDN media URLs in private transient Termux job files, filters them from normal diagnostic output and removes them after the attempt.
- Preserves format/FFmpeg handling, optional H.264/AAC phone-editor compatibility, duplicate prevention, Android media publication and post-download actions.
- Rewrites Help into an 18-section task-oriented guide and adds Copy guide / Share diagnostics.
- Retains alpha23's picture-aware controls/Pictures-to-PDF and alpha18's Splitter touch-dispatch invariant.

## Tests

The alpha24 regression suite passes, including `LinkedInVideoSupportTest`, existing picture/PDF/cookie/URL/activation/Splitter tests, Java syntax validation and source regression guards. A synthetic newer-layout LinkedIn metadata test also resolves a candidate without exposing its direct URL.

## Security

This public snapshot note contains no release keystore, signing password, private signing/recovery bundle, browser cookies, user media, private diagnostics or temporary signed LinkedIn CDN URL.
