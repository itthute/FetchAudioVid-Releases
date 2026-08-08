# v2.0.0-alpha16 changed-code summary

## Download-tab sharing

- Added `shareDownloadedMediaButton`.
- Added `last_media_share_ready` state.
- New downloads clear the share-ready state before starting.
- Successful `COMPLETE` jobs enable sharing only when a completed media path exists.
- Failed/cancelled jobs leave sharing unavailable.
- Duplicate-resolved jobs can enable sharing when the existing media path is known.
- `shareLastDownloadedMedia()` reuses the existing Media Library sharing implementation.

## yt-dlp troubleshooting popup

- Replaced the permanent `ytdlpCommandText` block and standalone `copyYtdlpCommandButton` with `troubleshootingCommandButton`.
- Added `showYtDlpTroubleshootingDialog()`.
- Added `lastYtDlpCommand()` helper.
- Added `shareLastYtDlpCommand()` for Android text sharing.
- Added `copyYtDlpCommandAndOpenTermux()` to copy the exact command and launch Termux without auto-executing it.
- Retained `copyLastYtDlpCommand()` as the clipboard action used by the popup.

## Version/build identity

- `APP_VERSION`: `2.0.0-alpha16`
- `APP_VERSION_CODE`: `20015`
- Manifest `versionName`: `2.0.0-alpha16`
- Manifest `versionCode`: `20015`
- Unsigned build artifact name updated to alpha16.

## Verification

The complete local regression suite passed, the Android build completed successfully, APK Signature Scheme v2 verification passed, and the signer certificate exactly matches alpha15.
