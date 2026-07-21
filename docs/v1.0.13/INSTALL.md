# ITthute Fetch AudioVid 1.0.13 installation guide

## Update from 1.0.12

Version 1.0.13 uses the same replacement signing certificate as the clean 1.0.12 build. It is intended to update 1.0.12 in place.

1. Do not uninstall version 1.0.12.
2. Do not uninstall Termux.
3. Open the signed 1.0.13 APK.
4. Select **Update** when Android prompts.
5. Open ITthute Fetch AudioVid.
6. Complete Android biometric or device-PIN authentication.
7. Run **Tools → Run full setup verification**.
8. Perform a short authorised test download.

## Important signing note

This signer is different from the old 1.0.10 signer. Devices still running the old signer must uninstall the old app before installing the replacement-signer line. Devices already running clean 1.0.12 can update directly to 1.0.13.

## Acceptance tests

After installation:

1. Paste the raw update-feed URL and confirm it is rejected as non-media.
2. Download one authorised public video.
3. Download one authorised public audio item.
4. Repeat a completed URL and confirm **Duplicate prevented**.
5. Open downloaded media from the app.
6. Import a fresh Netscape `cookies.txt` from a browser session that can play a restricted post.
7. Enable cookies and retry the restricted post.
8. Copy a diagnostic report and confirm it shows cookie status and count, but no cookie values.

## Do not publish private files

Do not commit or upload release keystores, signing passwords, private bundles, administrator plaintext credentials, browser cookies, or private diagnostics.
