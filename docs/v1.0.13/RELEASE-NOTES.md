# ITthute Fetch AudioVid 1.0.13 release notes

Version: `1.0.13`
Version code: `10013`
Package: `za.co.itthute.fetchaudiovid`
Minimum Android API: `26`
Target build platform: Android platform 28

## Summary

Version 1.0.13 hardens the downloader after real-device diagnostics from a Samsung SM-S938B on Android 16/API 36.

It addresses three observed problems:

1. Instagram and Facebook restricted pages may require authenticated browser cookies before yt-dlp can extract media.
2. Non-media URLs such as the app update feed could previously be sent to yt-dlp and saved as files such as `update_update.json`.
3. Android 16 may block ordinary background service starts for Termux RUN_COMMAND when the app is backgrounded or cached.

## Main changes

- Added optional Netscape `cookies.txt` import.
- Added safe cookie status diagnostics without cookie values.
- Added cookie record validation including normal Netscape and `#HttpOnly_` records.
- Added non-media URL rejection for update feeds, JSON, ZIP, APK, PDF, Office documents and raw GitHub non-media files.
- Updated Termux command launch path to use foreground service start on Android 8+.
- Retained Termux warm-up retry and user-assisted recovery.
- Improved failure messaging for Instagram/Facebook authentication and extractor failures.
- Added dedicated policy classes and repeatable tests for URL and cookie handling.

## Validation

The release build passed Java compilation, DEX generation, source regression tests, URL policy tests, cookie policy tests, activation tests, APK parsing and APK Signature Scheme v2 verification before distribution.

## Public artifact safety

Private signing keys, signing passwords, administrator plaintext password files, cookie files and user diagnostic reports are intentionally excluded from this public repository.
