# Source change summary - v2.0.0-alpha21

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20020`

Alpha21 is based on alpha20 and remediates the Picture/Post Images failures observed during device testing.

## Main source changes

- Common download polling now reads the job's recorded `LOG=` path instead of assuming `download-<job>.log`, allowing picture jobs to expose `pictures-<job>.log` correctly.
- Failed picture jobs include the real extractor detail in the user-facing diagnostic report.
- Added an embedded Facebook URL resolver that follows redirects and chooses a canonical post/photo/permalink URL before gallery extraction.
- Facebook resolution/extraction reuses imported Netscape cookies when enabled and explicitly disables video extraction in Picture mode.
- Added platform-specific picture failure classification for login/authentication, 403, 429/rate limits, unsupported URLs, unresolved Facebook share URLs and zero-image results.
- Hardened the embedded LinkedIn extractor for authwall/login/checkpoint detection and current LinkedIn media CDN URL forms.
- Persisted the `gallery-dl` version reported by dependency setup/verification.
- Cancel/status handling retains the picture job's actual log path.
- Alpha20 ordered post folders, zero-padded sequence naming, retry behavior and optional `post-info.txt` are retained.
- Alpha19 targeted media publication and alpha18's Splitter touch-dispatch invariant remain unchanged.

## Validation

The full local regression suite passes, including `PostPictureSupportTest`, source regression checks and Java syntax validation across 18 files. A clean Android API 28 / Build Tools 28.0.3 unsigned build also passes.

Source ZIP SHA-256:

`c286839b5b13ff3e56602bef4fd6279716176ee45111b2629df42dab2fc07919`

Alpha20 -> alpha21 patch SHA-256:

`0dc7b8de4f8e4cef2bdc7eec0a94ec1702da26cf900ab6494a5f21e03eafd0c0`

No keystore, signing password, cookies or private diagnostics belong in this public source area.
