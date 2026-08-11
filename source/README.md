# Source code area

This folder holds public ITthute Fetch AudioVid source-change snapshots and release-oriented source documentation.

## Latest snapshot

The latest documented change set is:

```text
source/v2.0.0-alpha23/
```

It documents alpha23's picture-aware post-download controls and the new on-device Pictures-to-PDF workflow. Picture jobs now open their containing post folder and suppress audio/video-only completion controls. The PDF utility selects a folder through Android SAF, naturally orders filenames such as `1, 2, 10` or `001, 002, 010`, and creates one aspect-ratio-preserving image per portrait/landscape PDF page.

Alpha22's separate social-cookie profiles and social-link reliability fixes, alpha19 media publication, and alpha18 Splitter touch-safety invariant remain preserved.

The corresponding release documentation is under:

```text
docs/v2.0.0-alpha23/
```

Older alpha/v1 snapshots remain available for historical reference.

## Security

Do not commit private signing keys, signing passwords, private signing backup ZIP files, browser/social-media cookies, private diagnostics, screenshots containing private data, or user media.
