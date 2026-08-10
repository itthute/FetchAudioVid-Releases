# ITthute Fetch AudioVid v2.0.0-alpha20

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20019`  
Minimum Android API: `26`  
Target Android API: `28`

## Picture/Post Images mode

Alpha20 adds a dedicated **Pictures (post/carousel images)** mode for Facebook, Instagram and LinkedIn post URLs.

The picture workflow creates a post-specific sub-folder under the selected target directory and stores images using ordered zero-padded sequence names such as `001.jpg`, `002.jpg` and `003.jpg`. Existing numbered outputs are retained on retry. When the extractor exposes mixed-media source positions, skipped non-picture positions are not deliberately collapsed, preserving the relationship to the source post order.

An optional `post-info.txt` file records platform, post URL/identifier, download time and image-count/order information.

### Platform implementation

- **Instagram:** `gallery-dl` image-only extraction with optional existing cookie-file support.
- **Facebook:** `gallery-dl` post/image extraction with optional existing cookie-file support.
- **LinkedIn:** built-in standard-library Python image extraction. This path is best-effort because LinkedIn can change page markup or asset presentation independently of the application.

Dependency setup/repair and Diagnostics now understand `gallery-dl`. Picture troubleshooting commands use the appropriate extractor for the selected platform.

### Android media publication

Completed picture paths are published using Android `MediaScannerConnection` and then, when available, alpha19's targeted best-effort `termux-media-scan` pass. Only exact completed image paths are scanned; there is no recursive shared-storage scan.

### Retained stability behavior

Alpha20 retains alpha18's Android 16 Splitter crash fix: slider touch callbacks do not rebuild/remove the Splitter range view hierarchy during active touch dispatch.

## Verification

Signed APK SHA-256:

`85c4823eaef7ca98cad2d44a49ccaad9decad6f1944d6cbafe6225cb9d7d8693`

Signer certificate SHA-256:

`9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf`

Local regression tests passed, including `PostPictureSupportTest`, Java syntax checks and source regression guards. A clean Android API 28 / Build Tools 28.0.3 build also completed successfully.

A deliberately unsigned practice APK was produced separately for private/manual signing practice; it is not committed to this public repository.

## Release feed

Alpha20 remains a test build. The production `update.json` is intentionally unchanged. The repository contains `update-v2.0.0-alpha20.example.json` only as a promotion template and it does not claim that a public alpha20 APK release asset currently exists.
