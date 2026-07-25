# Source archive information — v1.0.16

This public source snapshot corresponds to the signed build:

```text
ITthuteFetchAudioVid-v1.0.16.apk
Package: za.co.itthute.fetchaudiovid
Version code: 10016
Version name: 1.0.16
APK SHA-256: 44343a3da3382d27e80ec6709454068f86ac6537885998d896a34f15f615157f
Signer SHA-256: f1bd567df37fa936585c37c6041d152f183c32cb9ac0ddf2588256ba1460af2a
```

## Functional source changes

- `MainActivity.java`: added the Download-tab troubleshooting command display and copy button.
- `MainActivity.java`: stores the concrete yt-dlp command before launching the background worker.
- `MainActivity.java`: added Downloaded Media **Move file** and **Delete file** submenu actions.
- `MainActivity.java`: added Termux-backed move/delete commands, result handlers, media-index updates and stale-path cleanup.
- `TermuxBridge.java`: added `media_move` and `media_delete` command types.
- `tests/source_regression_test.py`: added checks for the copyable command and move/delete actions.

## Generated public artifacts

- `ITthuteFetchAudioVid-v1.0.16-source.zip`
- `ITthuteFetchAudioVid-v1.0.16-PATCH.diff`
- `ITthuteFetchAudioVid-v1.0.16-RELEASE-PACKAGE.zip`

## Security exclusions

The following are intentionally not committed:

- release keystore;
- private signing bundle;
- signing credentials;
- administrator plaintext credential file;
- browser cookies;
- private diagnostic reports;
- user media files.

The public repository records source/documentation and checksums only. Upload signed APK binaries as GitHub Release assets rather than committing them into the repository tree.