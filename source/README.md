# Source code area

This folder holds public ITthute Fetch AudioVid source-change snapshots and release-oriented source documentation.

## Latest snapshot

The latest documented change set is:

```text
source/v2.0.0-alpha26/
```

Alpha26 documents privacy-safe cookie profile insights and the safer Pictures-to-PDF destination/cleanup workflow. Cookie insight reporting identifies the configured Facebook, Instagram and LinkedIn profiles, records when Fetch AudioVid imported each export, calculates retained age, and can inspect safe aggregate Netscape-cookie metadata without exposing cookie names or values.

Pictures-to-PDF now defaults to the source folder's parent directory, supports typed or browsed custom targets, and optionally deletes the source tree only after output verification and complete image inclusion. A cleanup-enabled job cannot target the source directory or anything below it.

Alpha25's LinkedIn Video authentication-classification remediation, alpha24's LinkedIn fallback, alpha23 picture-aware workflow, alpha22 independent social cookie profiles and alpha18 Splitter touch-safety invariant remain preserved.

The corresponding release documentation is under:

```text
docs/v2.0.0-alpha26/
```

Older alpha/v1 snapshots remain available for historical reference.

## Security

Do not commit private signing keys, signing passwords, private signing backup ZIP files, browser/social-media cookies or cookie values, temporary signed CDN media URLs, private diagnostics, screenshots containing private data, or user media.