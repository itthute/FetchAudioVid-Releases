# ITthute Fetch AudioVid v2.0.0-alpha24

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20023`

## Purpose of this alpha

Alpha24 adds a defensive LinkedIn Video workflow for videos the user owns or is authorised to save, and expands the in-app Help into a complete operational/troubleshooting guide.

## LinkedIn Video workflow

Use the normal **Download → Video** workflow with a `linkedin.com` post/activity URL or an `lnkd.in` short link.

1. The app runs the installed `yt-dlp` LinkedIn extractor first.
2. If yt-dlp succeeds, the normal media workflow continues unchanged.
3. If yt-dlp returns a recognized LinkedIn extraction-layout error and no output file was produced, alpha24 automatically invokes its local fallback.
4. The fallback can inspect classic `<video data-sources>` markup and newer LinkedIn JSON media metadata held in `<code>` elements.
5. It can identify progressive MP4, HLS and DASH candidates.
6. The selected stream is handed back to yt-dlp for downloading so normal format selection, FFmpeg post-processing, optional phone-editor compatibility and app post-download actions remain in one pipeline.

If the target post requires authentication, enable imported website cookies and ensure the retained LinkedIn profile came from a browser session that can play the exact post. Alpha24 does not bypass login or access controls.

Temporary signed LinkedIn CDN URLs are treated as sensitive: they live only in private Termux job files, are filtered from normal diagnostics and are deleted after the fallback attempt.

## Help / complete user guide

The in-app guide has been rewritten into 18 task-oriented sections covering responsible use, setup, Video, LinkedIn Video, Audio, picture posts, cookies, post-download actions, Pictures-to-PDF, Media Library, Splitter, Converter, metadata editing, Tools/maintenance, updates/rollback, diagnostics/troubleshooting, issue/crash reporting and security/privacy/activation.

The Help dialog adds **Copy guide** and **Share diagnostics** so users can retain instructions or send a safe diagnostic report without hunting through menus.

See [USER-GUIDE.md](USER-GUIDE.md) for the public companion guide.

## Retained alpha23 functionality

- Facebook, Instagram and LinkedIn picture-post downloads.
- **Open downloaded picture folder** for picture jobs.
- Picture jobs suppress unrelated audio/video completion controls.
- **Create PDF from picture folder** with natural filename-number ordering and one aspect-ratio-preserving picture per page.
- Independent Facebook/Instagram/LinkedIn cookie profiles.
- Android 16 Splitter touch-dispatch safety invariant.

## Validation

The clean Android API 28 / Build Tools 28.0.3 build passes. The expanded regression suite passes, including `LinkedInVideoSupportTest`, `PicturePdfSupportTest`, social-picture/cookie/URL/activation/Splitter tests, Java syntax checks and source regression guards.

See [APK-VERIFICATION.txt](APK-VERIFICATION.txt) for the verified build identity.

## Field-testing focus

Test with videos you own or are authorised to save:

- a canonical LinkedIn post URL;
- the corresponding or another `lnkd.in` short link;
- a publicly available authorised video;
- cookies enabled when LinkedIn requires login;
- Phone editor compatibility both off and on where relevant;
- duplicate retry behavior;
- diagnostics after a fallback attempt, confirming no signed `licdn.com` direct-media URL is exposed.

If a LinkedIn video still fails, capture a fresh alpha24 diagnostic report after one controlled reproduction. Safe fallback status markers can be included; cookies and direct signed CDN links must not be shared.

## Release-channel status

Alpha24 is test documentation only. The production `update.json` remains on the existing production version and is not changed by this alpha documentation update.
