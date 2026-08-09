# ITthute Fetch AudioVid v2.0.0-alpha19 source-change snapshot

This folder documents the source changes for **v2.0.0-alpha19**.

Build identity:

```text
Package: za.co.itthute.fetchaudiovid
Version name: 2.0.0-alpha19
Version code: 20018
Minimum Android API: 26
Target Android API: 28
APK SHA-256: 0e503e3ad1f8eb59b02b1d71728a08ae065e02a913714ba011b87d8f579f8340
Source ZIP SHA-256: 2672763fb97b066c85be253ee3ceb480c51ec13d6e4a5ec389ceab29c722503e
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

Alpha19 adds a quiet, best-effort secondary media publication path through Termux. Android MediaScannerConnection remains primary. The secondary path submits `termux-media-scan` only for exact final media paths, batches Splitter outputs, records its result in Diagnostics, and never recursively scans broad shared storage.

Private signing material, browser cookies, private diagnostics and user media are intentionally excluded from the public repository.
