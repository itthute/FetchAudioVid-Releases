# Source code area

This folder holds public ITthute Fetch AudioVid source-change snapshots and release-oriented source documentation.

## Latest snapshot

The latest documented change set is:

```text
source/v2.0.0-alpha25/
```

Alpha25 documents the correction to alpha24's LinkedIn Video fallback authentication classifier. The fallback now scans classic video markup and LinkedIn JSON media metadata in `<code>` and `<script>` blocks before deciding that authentication failed. Incidental authwall/login wording in otherwise usable LinkedIn HTML is ignored; strong login/authwall/checkpoint redirects or real login forms remain recognized when no video metadata is available.

The same retained LinkedIn Netscape cookie profile and browser-like LinkedIn request context are used by the fallback. Temporary signed CDN media URLs remain private and are removed after the attempt.

Alpha24's expanded Help/user guide, alpha23's picture-aware post-download controls and Pictures-to-PDF workflow, alpha22's independent social cookie profiles, and alpha18's Splitter touch-safety invariant remain preserved.

The corresponding release documentation is under:

```text
docs/v2.0.0-alpha25/
```

Older alpha/v1 snapshots remain available for historical reference.

## Security

Do not commit private signing keys, signing passwords, private signing backup ZIP files, browser/social-media cookies, temporary signed CDN media URLs, private diagnostics, screenshots containing private data, or user media.
