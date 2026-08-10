# Source change summary - v2.0.0-alpha20

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20019`

Alpha20 builds on alpha19 and adds the Picture/Post Images download path.

## Main source changes

- Added `MEDIA_PICTURES` mode and Picture-specific Download UI behavior.
- Added `PostPictureSupport.java` for platform detection, post identifiers, safe post-folder names, image-extension handling and LinkedIn extraction support.
- Facebook/Instagram picture jobs use `gallery-dl`; dependency setup/repair, version diagnostics and troubleshooting now include it.
- LinkedIn picture jobs use an embedded standard-library Python extractor designed to identify LinkedIn-hosted post images and retain first-observed media order. It is best-effort because LinkedIn markup can change.
- Picture output uses zero-padded ordered filenames and a post-specific sub-folder inside the selected destination.
- Optional `post-info.txt` can be generated without being submitted as media to Android indexing.
- Picture retry behavior retains completed numbered images and avoids renumbering missing positions.
- Android MediaScannerConnection plus alpha19's exact-path Termux media publication are reused for completed images.
- Picture-aware post-download actions and troubleshooting were added while audio/video Splitter/Converter behavior remains unchanged.

## Stability inheritance

The alpha18 Splitter touch-dispatch invariant remains protected: no Splitter range hierarchy rebuild occurs from active slider touch callbacks or unsafe delayed rollback paths.

## Validation

`PostPictureSupportTest`, the existing policy/range tests, Java syntax validation and source regression checks all pass. The clean private Android build also passes.

Source ZIP SHA-256:

`0ed62ab7e038a24d78a82d8f149fbdb88a81fff93b7dc37885fefa9a1f097e18`

Alpha19 -> alpha20 patch SHA-256:

`577e3f4c90b7e752dd400e29d0694fd9498ef0a762d167e931213a466a7055ae`

No keystore, signing password, browser/social-media cookies or private diagnostic data belongs in this public source area.
