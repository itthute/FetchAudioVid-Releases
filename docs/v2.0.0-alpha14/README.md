# ITthute Fetch AudioVid v2.0.0-alpha14

This folder documents the **v2.0.0-alpha14** Android test build.

Package identity:

```text
Package: za.co.itthute.fetchaudiovid
Version name: 2.0.0-alpha14
Version code: 20013
Minimum Android API: 26
Target Android API: 28
```

## Alpha14 improvements

- **Edit in Splitter** in each Media Library file menu, with direct file loading and automatic switch to the Splitter tab.
- **Playback split** buttons after export, one for each generated split file.
- **Edit in Converter** in each Media Library file menu, with direct file loading and automatic switch to the Converter tab.
- **Diagnostics** in the main top-right menu, so Diagnostics remains reachable when its bottom-navigation icon is hidden.
- Facebook long-filename reduction for numeric-leading filenames longer than 30 alphanumeric characters. The rule removes the views/reactions prefix through the reactions marker and removes runs of 13 or more consecutive digits.

## Files

- `RELEASE-NOTES.md` — user-facing release summary.
- `FIX-REPORT.md` — implementation details.
- `INSTALL-AND-TEST.txt` — in-place upgrade and device acceptance procedure.
- `APK-VERIFICATION.txt` — package, signature and regression verification.
- `SHA256.txt` — published build-artifact hashes.

The live production update feed in `main/update.json` is intentionally not changed by this alpha documentation update.
