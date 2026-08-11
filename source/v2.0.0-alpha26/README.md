# Source snapshot notes — v2.0.0-alpha26

Alpha26 (`versionCode 20025`) is based on alpha25 and preserves package `za.co.itthute.fetchaudiovid`, minSdk 26, target/compile API 28 and the retained 2026-v2 signing line.

The source change set adds privacy-safe cookie-profile insight UI/logic and extends the Pictures-to-PDF source/target model. Cookie insight helpers track app-side import timestamps and request aggregate Termux-side metadata without exposing cookie names or values. PDF path helpers add parent-target calculation and same/descendant safety checks; the activity adds target browsing/authorization and conservative post-verification source-tree deletion.

Regression protections retain the LinkedIn fallback/auth-classification behavior and the Android 16 Splitter rule: never rebuild the Splitter range-row hierarchy during active slider touch dispatch.

Verified external identities:

```text
Source ZIP SHA-256: bd1cf9543a96f3407235a91235048ddbf9bee35778cac6593686fb4017b1b7e5
Alpha25→26 patch:   6e7156e10ec2ce3a88d0bba1be07a1cd6f3747f87734a4f5a7c014c1d571ddd4
```

Private signing material, browser/social cookies and user diagnostics/media are not part of this public source documentation.