# Source code area

This folder holds public ITthute Fetch AudioVid source-change snapshots and release-oriented source documentation.

## Latest snapshot

The latest documented change set is:

```text
source/v2.0.0-alpha24/
```

It documents alpha24's LinkedIn Video resilience path and expanded Help/user guide. LinkedIn Video jobs continue to use normal yt-dlp first; when yt-dlp returns a recognized extraction-layout failure without a media file, a local authenticated-page fallback can inspect classic video markup and newer LinkedIn code-block JSON for progressive MP4/HLS/DASH media before handing the selected stream back to yt-dlp. Temporary CDN links are kept private and removed after the attempt.

Alpha24 also turns **Help / complete user guide** into an 18-section task-oriented manual covering setup, all download modes, cookies, picture-post/PDF workflows, Media Library, Splitter, Converter, metadata, maintenance, updates/rollback, diagnostics, troubleshooting, issue/crash reporting, security/privacy and activation.

Alpha23's picture-aware post-download controls and Pictures-to-PDF workflow, alpha22's independent social cookie profiles, and alpha18's Splitter touch-safety invariant remain preserved.

The corresponding release documentation is under:

```text
docs/v2.0.0-alpha24/
```

Older alpha/v1 snapshots remain available for historical reference.

## Security

Do not commit private signing keys, signing passwords, private signing backup ZIP files, browser/social-media cookies, temporary signed CDN media URLs, private diagnostics, screenshots containing private data, or user media.
