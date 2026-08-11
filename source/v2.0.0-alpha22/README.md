# Source change summary - v2.0.0-alpha22

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20021`

Alpha22 builds on alpha21 and addresses platform/profile handling uncovered by real-device diagnostics.

## Source changes

- Added independent retained Netscape cookie profiles for Facebook, Instagram and LinkedIn.
- Cookie imports auto-detect supported platform domains, update the matching profile(s), retain other profiles, and keep a legacy generic fallback for migration.
- Video/audio and Picture workers select the cookie profile matching the target URL.
- Diagnostics reports per-profile configured state, record count and import time without cookie contents.
- Added Facebook `/share/...` fallback canonicalisation through yt-dlp redirect output when the HTTP resolver cannot resolve the share link.
- Added `lnkd.in` and subdomain classification as LinkedIn Picture-mode input.
- Improved Facebook unresolved-share versus authentication error classification.
- Preserved Instagram Picture behavior, ordered post folders, zero-padded numbering and optional `post-info.txt`.
- Preserved alpha19 exact-path media publication and alpha18 Splitter touch-dispatch safety.

## Validation

All policy, cookie, picture-support, range, Java syntax and source regression tests pass. Clean Android API 28 / Build Tools 28.0.3 build passes.

Source ZIP SHA-256:

`c39a626352e17145a3f55bb6658b662b146b3b6c08e8f6c373697216fb285152`

Alpha21 -> alpha22 patch SHA-256:

`79644102933acd20ad205007c8b837073db20ea9daba9ebb6dc197776be4d170`

No keystore, signing password, browser/social-media cookie export, private diagnostic report or user media belongs in this public source area.
