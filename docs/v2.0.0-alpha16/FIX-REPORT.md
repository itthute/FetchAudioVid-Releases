# ITthute Fetch AudioVid v2.0.0-alpha16 Fix Report

## Share downloaded media

A new **Share downloaded media** action is added to the Download tab. It is hidden until a download reaches the app's `COMPLETE` state, after yt-dlp has finished post-processing and returned the final media path. The `last_media_share_ready` state prevents incomplete or failed jobs from exposing the share action.

Starting a new download clears the share-ready state. A successfully completed download restores it. A duplicate-resolved download may also expose sharing when the existing completed media path is known. Failed or cancelled jobs do not enable sharing.

The action reuses the app's existing MediaStore/content-provider sharing path used by Media Library.

## Compact troubleshooting command

The large always-visible yt-dlp command block and separate Copy button are replaced with one **Troubleshooting command** button. Its popup contains the job/time details, the full selectable command, **Copy command**, **Copy & open Termux**, and **Share command**.

**Copy & open Termux** deliberately copies the command to the clipboard and opens Termux without automatically executing it. This keeps manual troubleshooting explicit and avoids accidentally starting a duplicate download.

## Retained alpha15 improvements

Alpha16 retains the Splitter target-folder browser, high-contrast dark-theme editable fields, Splitter lock/undo/vertical-scroll protection, download-to-Media Library/Splitter/Converter shortcuts, repair of yt-dlp temporary-file editor paths, Media Library request-generation tokens and single-file media-scan fixes.
