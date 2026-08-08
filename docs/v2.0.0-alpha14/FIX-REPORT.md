# ITthute Fetch AudioVid v2.0.0-alpha14 — Improvement Report

## Implemented

- **Media Library → Edit in Splitter**: adds the requested file-menu action, assigns the selected audio/video file as the active Splitter source, clears stale split state, switches to Splitter and probes the media.
- **Post-split verification controls**: after a successful export, the app renders one **Playback split N** button for every generated output. The latest output list persists across normal tab switches/app recreation until a new source or new split job replaces it.
- **Media Library → Edit in Converter**: adds the requested file-menu action, loads the selected media as the Converter source, clears stale conversion-result state, switches to Converter and probes the media.
- **Diagnostics in main menu**: Diagnostics can now always be opened through the top-right menu even when it is not one of the visible bottom navigation tabs.
- **Facebook filename reduction**: applies only to Facebook/fb.watch downloads when the filename starts with a digit and its stem contains more than 30 alphanumeric characters. It removes everything through the reactions marker, removes all 13+ digit runs, trims separators and protects collisions.

## Facebook marker handling

The requested human-readable marker is ` reactions | `. With `yt-dlp --restrict-filenames`, the same title pattern reaches the application as `_reactions_`. Alpha14 deliberately recognizes **both forms**, so the rule works against the actual filenames observed in the supplied Android diagnostics while remaining faithful to the requested rule.

## Validation

- Source regression suite: PASS.
- Java syntax compilation: PASS, 16 Java files.
- Clean Android API 28 build: PASS.
- APK Signature Scheme v2 verification: PASS.
- Alpha13 and alpha14 signer SHA-256 values: MATCH.
- Package unchanged and versionCode increased from 20012 to 20013.
