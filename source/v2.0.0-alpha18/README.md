# ITthute Fetch AudioVid v2.0.0-alpha18 source-change snapshot

This folder documents the source changes for **v2.0.0-alpha18**.

Build identity:

```text
Package: za.co.itthute.fetchaudiovid
Version name: 2.0.0-alpha18
Version code: 20017
Minimum Android API: 26
Target Android API: 28
APK SHA-256: 246c3dc02e15890648edf37e4687e108872be9fc14ed58ad063ed75d86b97994
Source ZIP SHA-256: 5405c732f6655898265ecf21dd9f5c09c887c66bb6a032617c48a9f8865bc9fa
Signer SHA-256: 9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

Alpha18 changes the Splitter slider finish/invalid-range path so it never removes/rebuilds child views while Android is dispatching the slider gesture. Existing widgets are updated in place instead.

Private signing material, browser cookies, private diagnostics and user media are intentionally excluded from the public repository.
