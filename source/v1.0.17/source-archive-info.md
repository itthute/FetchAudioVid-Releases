# ITthute Fetch AudioVid 1.0.17 source archive information

The complete source archive produced in the build workspace is:

```text
ITthuteFetchAudioVid-v1.0.17-source.zip
```

The source archive contains the Android manifest, resources, build scripts, Java sources, tests and release documentation for version 1.0.17.

## Important source changes

- `MainActivity.java` version identity updated to `1.0.17 / 10017`.
- Downloaded Media item menu now includes **Edit metadata**.
- Metadata read flow uses FFprobe to read `format_tags` as JSON.
- Metadata write flow uses FFmpeg stream copy and writes appropriate tags for audio or video containers.
- Common genre picker added while keeping manual genre typing enabled.
- Android media indexing refresh is run after metadata saves.
- `TermuxBridge.java` adds metadata read/write command types.
- `source_regression_test.py` adds coverage for metadata menu, FFprobe/FFmpeg command construction, genre picker, year validation and media-library refresh.

## Public repository exclusions

The following are intentionally excluded from public source publishing:

- private release keystores;
- signing credentials;
- private signing bundles;
- administrator plaintext credential files;
- browser cookies;
- user diagnostics;
- user media files.
