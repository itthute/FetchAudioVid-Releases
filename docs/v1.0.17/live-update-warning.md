# Live update warning

This repository update does not replace `main/update.json`.

The live update feed should be updated only after:

1. a GitHub Release named `v1.0.17` exists;
2. the signed APK is uploaded to that release as `ITthuteFetchAudioVid.apk`;
3. the release asset URL downloads successfully;
4. the downloaded asset SHA-256 equals `e8a114793a67e3a36dfdcbd2b4fdd4a4a8629cc54719f950f964235292aeab3d`.

Until then, `update-v1.0.17.example.json` is a reviewed example only.
