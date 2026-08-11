# ITthute Fetch AudioVid v2.0.0-alpha23

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20022`

## Picture-aware completion

Alpha23 refines the picture-post workflow now field-tested successfully with Facebook, Instagram and LinkedIn.

After a successful picture-post download:

- the primary action reads **Open downloaded picture folder** and opens the containing post folder;
- audio/video-specific completion actions are hidden for that picture job;
- normal completion actions automatically return after a later audio or video download.

## Pictures to PDF

The Tools tab now includes **Create PDF from picture folder**.

The user selects a folder through Android's Storage Access Framework. Supported pictures are sorted in natural numeric filename order, so `1.jpg`, `2.jpg`, `10.jpg` remain in that order and zero-padded post files such as `001.jpg`, `002.jpg`, `010.jpg` also retain their intended order.

The generated PDF is created in the selected source folder. Each decodable image gets one page; portrait/landscape orientation follows the image aspect ratio, and the picture is scaled proportionally within margins without cropping. Undecodable images are skipped and reported rather than aborting a usable PDF.

## Preserved behavior

Alpha23 retains alpha22's independent Facebook, Instagram and LinkedIn cookie profiles, Facebook `/share/...` fallback resolution, LinkedIn `lnkd.in` support, ordered picture post folders and established audio/video functionality. The alpha18 Android 16 Splitter touch-dispatch safety invariant is unchanged.

## Verified identity

```text
Signed APK SHA-256:
2365bfeb9d11394d1cc5a94f56e4849c5d9474cec965efad349435308840e8ce

Unsigned practice APK SHA-256:
f20157664f5e6ce27471b5e1e0ddafd0e99e5ede385fa5fb2ced53e20bedc04f

Signer certificate SHA-256:
9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf

Source ZIP SHA-256:
7d7909ca25457b6b23896562baa18bc2e6116c5887b83c8bbf37522ba26e1369

Alpha22 -> alpha23 patch SHA-256:
6e8fb622450637d83640453b030d2aefb0b66423e557c0a2c980d5fb8f8c30db
```

Regression tests, including `PicturePdfSupportTest`, passed. The private clean Android API 28 / Build Tools 28.0.3 build also passed in GitHub Actions run `31450617971`.

The production `update.json` is intentionally unchanged while alpha23 remains a test build.
