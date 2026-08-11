# ITthute Fetch AudioVid v2.0.0-alpha22

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20021`

Alpha22 addresses Facebook and LinkedIn Picture/Post Images failures observed in alpha21 field diagnostics.

## Root causes addressed

1. Alpha21 retained one global imported `cookies.txt`; later imports replaced earlier Facebook/Instagram/LinkedIn sessions.
2. Facebook `/share/...` links could return HTTP 400 in the first resolver and remain in a URL form that gallery-dl rejects.
3. `lnkd.in` LinkedIn short links were not classified as LinkedIn by Picture mode.

## Fixes

- Separate retained cookie profiles for Facebook, Instagram and LinkedIn.
- Automatic platform-specific profile selection, with the old generic cookie file retained only as a migration fallback.
- Facebook yt-dlp redirect-discovery fallback when the HTTP resolver cannot canonicalise `/share/...`.
- `lnkd.in` accepted as LinkedIn Picture-mode input.
- Per-profile cookie state in Diagnostics without exposing cookie contents.
- Improved Facebook failure classification and resolution logging.

After upgrading from alpha21, re-import the Facebook, Instagram and LinkedIn Netscape cookie files once each. Alpha22 will retain the three profiles independently.

## Build identity

Signed APK SHA-256:

`910c7401640543b5dac2f827a48fbace7993c702dce006bc7ee3bf5b11a4e349`

Signer certificate SHA-256:

`9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf`

Source ZIP SHA-256:

`c39a626352e17145a3f55bb6658b662b146b3b6c08e8f6c373697216fb285152`

Alpha21 -> alpha22 patch SHA-256:

`79644102933acd20ad205007c8b837073db20ea9daba9ebb6dc197776be4d170`

## Release channel

Alpha22 remains a test build. The live production `update.json` remains unchanged.
