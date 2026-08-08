# ITthute Fetch AudioVid v2.0.0-alpha14

## Improvements

- Adds **Edit in Splitter** to each Media Library file menu. The selected media is loaded directly and the app switches to Splitter.
- Adds **Edit in Converter** to each Media Library file menu. The selected media is loaded directly and the app switches to Converter.
- After a successful split, one **Playback split N** button appears per generated file so each clip can be verified immediately. The most recent split outputs persist across tab switches/app recreation until new media or a new split job replaces them.
- Adds **Diagnostics** to the top-right main menu, providing access even when Diagnostics is hidden from the configurable navigation bar.
- Adds a Facebook long-filename reducer: for Facebook downloads whose filename starts numerically and contains more than 30 alphanumeric characters, the leading views/reactions portion is removed through the `reactions` marker and every run of 13+ digits is removed. Existing target names are protected by a numeric collision suffix.

## Compatibility

- Package remains `za.co.itthute.fetchaudiovid`.
- Version code: `20013`.
- Android min API 26; target API 28.
- Signed alpha14 APK SHA-256: `9546c93d3e8a2888cfd708022ea69aa6afdde4708a69be5f83794957874fb23c`.
- Signer certificate SHA-256: `9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf`.
