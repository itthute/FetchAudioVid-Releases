# Source notes — ITthute Fetch AudioVid v2.0.0-alpha23

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20022`

Alpha23 changes the picture-post completion UI and adds an on-device ordered Pictures-to-PDF utility.

## Main runtime changes

- Picture jobs use **Open downloaded picture folder** and open the stored containing post directory.
- Picture completion hides audio/video-only Media Library, Splitter, Converter, Locate and single-file Share controls.
- Audio/video jobs restore their normal post-download controls.
- Tools includes **Create PDF from picture folder** and **Open last created picture PDF**.
- Folder selection and output use Android Storage Access Framework URIs.
- `PicturePdfSupport` implements supported-image detection, safe PDF naming and natural numeric filename ordering.
- `PdfDocument` creates one fitted image per page, using portrait/landscape orientation according to image aspect ratio.
- Large pictures are sampled during decode to control memory use; undecodable pictures are skipped and counted.
- The PDF is stored in the selected picture source folder.

## Regression protection

Alpha23 preserves alpha22's social-cookie/profile and social-link extraction behavior and the alpha18 rule that Splitter range-view hierarchy rebuilds must not occur during active touch dispatch.

Local regression suite: PASS, including `PicturePdfSupportTest` and Java syntax validation across 20 source/test files.

Private clean Android API 28 / Build Tools 28.0.3 build: PASS, GitHub Actions run `31450617971`.

## Artifact identities

```text
Signed APK SHA-256:
2365bfeb9d11394d1cc5a94f56e4849c5d9474cec965efad349435308840e8ce

Unsigned APK SHA-256:
f20157664f5e6ce27471b5e1e0ddafd0e99e5ede385fa5fb2ced53e20bedc04f

Source ZIP SHA-256:
7d7909ca25457b6b23896562baa18bc2e6116c5887b83c8bbf37522ba26e1369

Alpha22 -> alpha23 patch SHA-256:
6e8fb622450637d83640453b030d2aefb0b66423e557c0a2c980d5fb8f8c30db
```

No private signing key, signing password, browser cookies, user diagnostics or media are included in this public source documentation.
