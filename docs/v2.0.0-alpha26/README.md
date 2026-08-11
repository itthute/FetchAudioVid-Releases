# ITthute Fetch AudioVid v2.0.0-alpha26

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20025`  
Minimum Android API: `26`  
Target/compile API: `28`

## Highlights

Alpha26 adds privacy-safe cookie-profile visibility and improves the Pictures-to-PDF destination/cleanup workflow.

### Cookie profile insights

The Download tab now exposes safe information about the independently retained Facebook, Instagram and LinkedIn cookie profiles. Fetch AudioVid records each profile's import date/time and shows how long that export has been retained. A refreshed insight view reports only aggregate Netscape-cookie metadata: cookie record count, unique domain count, session/persistent counts, expired-record count, Secure/HttpOnly counts, earliest/latest future expiry and retained-file modification time. The route selected for the current URL is clearly identified.

Cookie names and values are deliberately excluded. Import age is the age of the export retained by Fetch AudioVid, not the age of the original browser login. A session cookie has no fixed expiry in Netscape format, and an unexpired cookie does not guarantee that a server-side session is still accepted.

### Pictures-to-PDF

After a source-picture folder is selected, the proposed PDF target is its parent folder. The user can instead type another shared-storage path or browse to another destination. Android Storage Access Framework authorization is requested or reused as required; selecting the source folder does not automatically grant write permission to its parent.

An optional cleanup setting can delete the complete source-picture directory after the PDF has been created. Cleanup is conservative: the output must reopen and verify as a PDF, every selected image must have been included, and the output target must be outside the source tree. When cleanup is enabled the source directory itself and all descendants are rejected as output destinations. Any skipped image or provider deletion failure leaves the source intact.

Cleanup removes the whole selected source directory, including non-picture files such as `post-info.txt`, so users should enable it only when that is intended.

## Verified build identity

```text
Signed APK SHA-256:   013dee89d0787f20f7a812e0f50f657842b87682741f23b7d2264e0e09955212
Unsigned SHA-256:     c86865bfc1c1bdafc7ff688dcb9bb5b76e0a26cc2aee6fc2577718c08747eb4b
Signer SHA-256:       9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
Source ZIP SHA-256:   bd1cf9543a96f3407235a91235048ddbf9bee35778cac6593686fb4017b1b7e5
Alpha25→26 patch:     6e7156e10ec2ce3a88d0bba1be07a1cd6f3747f87734a4f5a7c014c1d571ddd4
```

The signed APK verifies with APK Signature Scheme v2, one RSA-4096 signer, and the retained ITthute 2026-v2 certificate. The clean Android API 28 / Build Tools 28.0.3 build and complete regression suite pass.

## Release channel

Alpha26 remains a test build. The production `update.json` is intentionally unchanged. No alpha26 binary GitHub Release asset is claimed by this documentation update.