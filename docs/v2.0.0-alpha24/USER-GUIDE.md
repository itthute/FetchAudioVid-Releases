# ITthute Fetch AudioVid v2.0.0-alpha24 — User Guide

This companion guide mirrors the task-oriented Help supplied inside the app. Use Fetch AudioVid only for media you own, material you have permission to save, or media whose terms/licence allow downloading.

## 1. First-time setup

Open **Tools → Guided setup / migration wizard** and follow the prompts. The app uses Termux for yt-dlp/FFmpeg and related command-line work. When setup finishes, run **Tools → Run full setup verification**. If Android has rebooted or Termux will not respond, open Termux once and use **Prepare / open Termux after reboot**.

## 2. Download a video

1. Open **Download**.
2. Paste the authorised media URL.
3. Choose **Video**.
4. Select Single item or Playlist as appropriate.
5. Choose the destination and desired output/compatibility options.
6. Enable imported cookies only when the website requires an authenticated session.
7. Tap **DOWNLOAD VIDEO**.

After success, Playback, Share, Media Library, Splitter and Converter handoffs become available as appropriate.

## 3. Download a LinkedIn video

Use a normal LinkedIn post/activity URL or an `lnkd.in` short link with **Video** selected.

Alpha24 deliberately runs yt-dlp first. If yt-dlp succeeds, the ordinary workflow continues. If it fails with a recognized LinkedIn extraction-layout error before producing a file, alpha24 automatically tries its built-in LinkedIn fallback. The fallback understands older video markup and newer LinkedIn page metadata capable of describing progressive MP4, HLS or DASH streams, then gives the chosen stream back to yt-dlp for the actual download.

If LinkedIn presents a login wall, import fresh LinkedIn Netscape cookies from a browser session that can play the exact post, enable cookies and retry. The fallback does not defeat privacy controls or authentication.

If the fallback says no video metadata was found, verify that the post really contains a video and that you can play it in your browser. Then share a fresh diagnostic report because LinkedIn may have changed its page representation.

## 4. Download audio

1. Paste an authorised media URL.
2. Select **Audio**.
3. Choose the desired audio format.
4. Choose Single item/Playlist and destination.
5. Enable cookies if authentication is required.
6. Tap **DOWNLOAD AUDIO**.

FFmpeg performs the requested extraction/conversion after yt-dlp retrieves the source.

## 5. Download Facebook, Instagram or LinkedIn picture posts

1. Select **Pictures**.
2. Paste a Facebook, Instagram or LinkedIn post URL.
3. Choose the destination.
4. Optionally retain `post-info.txt`.
5. Tap **DOWNLOAD PICTURES**.

Each post receives its own folder and pictures are numbered in post/carousel order. On success use **Open downloaded picture folder** to see the whole set. Audio/video-only completion buttons are hidden for picture jobs.

## 6. Website login cookies

Export cookies in **Netscape HTTP Cookie File** format from a browser session you control. Import them through the app's Website login cookie controls. Fetch AudioVid retains separate Facebook, Instagram and LinkedIn profiles and selects the matching one for the target URL.

If a session expires or the platform signs you out, export and import a fresh cookie file.

Never send cookie files to support, GitHub, email or chat. Cookie values can represent an active authenticated session and are intentionally excluded from diagnostics.

## 7. Post-download actions

For successful Video/Audio jobs, the app can expose Playback, Share, Show in Media Library, Edit in Splitter, Edit in Converter and location actions. Starting a new job resets stale completion actions.

For picture jobs, **Open downloaded picture folder** is the main completion action because one post can contain multiple pictures.

## 8. Create a PDF from pictures

1. Open **Tools → Picture utilities → Create PDF from picture folder**.
2. Select the folder containing the pictures.
3. Review the detected natural filename-number order.
4. Edit the suggested PDF filename if desired.
5. Create the PDF.

Natural ordering understands `1, 2, 10` correctly and also works with `001, 002, 010`. Each decodable picture becomes one page. Portrait/landscape page orientation follows the picture and aspect ratio is preserved without cropping. Undecodable images are skipped and reported rather than destroying an otherwise valid PDF job.

Use **Open last created picture PDF** to reopen the newest output.

## 9. Media Library

Media Library scans the current destination, configured extra folders and generated Splitter/Converter outputs. Use All/Audio/Video filters, Refresh and paging controls. A file's menu can provide Open, Splitter/Converter handoff, Rename, metadata editing, Share, Move, Delete, Copy path, Locate and media refresh actions.

Refresh the library after another app creates or moves media while Fetch AudioVid remains open.

## 10. Splitter

Load audio/video from storage, Media Library or a Download handoff. Edit Start/End values or drag the range handles horizontally. Vertical swipes over the slider scroll the page instead of becoming accidental slider changes.

Ranges must remain sequential, non-overlapping and at least the configured minimum duration. **Lock clip** freezes a range. **Undo last slider move** restores the most recent completed horizontal drag; a tap/no-change or vertical scroll does not replace the useful Undo snapshot.

**SPLITTER — DIVIDER MODE** automatically creates sequential clips. The default divider is 90 seconds, with additional choices/custom duration available. Use **Save splitter clips** to choose an output location. Exported clips receive Playback controls.

## 11. Converter

Load a supported media file, choose an output format, optionally edit output name/location and start conversion. FFmpeg converts locally. On success the app indexes the exact output and asks Android to refresh that media path.

## 12. Metadata editor

From **Media Library → file menu → Edit metadata**, edit supported audio/video metadata. Audio fields can include Title, Artist, Album, Album artist, Genre, Year/date, Track and Comment. Video exposes appropriate title/creator/genre/date/comment fields where the container supports them. FFmpeg rewrites metadata while preserving streams where possible.

## 13. Tools and maintenance

Useful Tools include:

- **Guided setup / migration wizard** — initial install or recovery.
- **Run full setup verification** — verify Android/Termux/tool dependencies.
- **Prepare / open Termux after reboot** — recover the command service after reboot or OS change.
- **Switch yt-dlp stable / nightly channel** — Nightly can contain website fixes before the next stable release.
- **Check Termux dependency updates** — report pending updates.
- **Guided dependency upgrade / repair** — repair/refresh the toolchain.
- **Picture utilities** — create PDFs from ordered pictures.

## 14. Updates and rollback

**Check for ITthute Fetch AudioVid update** reads the configured update feed. Release metadata/signing identity must be validated before installing an update. Configure private/test feeds only intentionally. A correctly signed in-place upgrade normally should be installed over the existing build rather than uninstalling it first, because uninstalling can remove app state.

## 15. Diagnostics and troubleshooting

Match the symptom to the first relevant action:

- **Setup not verified** — Guided setup, then full setup verification.
- **Termux will not start a command** — open Termux once; after reboot use Prepare/open Termux after reboot.
- **DNS/host-resolution error** — run Diagnostics DNS/HTTPS checks; compare Wi-Fi/mobile data; review VPN, Private DNS, DNS filtering or ad blocking.
- **Login/authentication required** — refresh the matching platform cookie profile from a browser able to open/play the exact media.
- **Extractor changed / Unable to extract** — try yt-dlp Nightly and retry. LinkedIn Video also has alpha24's automatic fallback.
- **Duplicate prevented** — use the reported existing media rather than repeatedly downloading it.
- **Video will not edit on the phone** — enable Phone editor compatibility and retry.
- **File exists but Gallery/Files does not show it** — refresh Media Library/media indexing.
- **Picture post is empty** — confirm still pictures exist, refresh cookies if needed, retry once, then share Diagnostics.
- **Splitter/Converter failure** — confirm the source plays and the destination is writable, then share Diagnostics with the approximate time.

### Troubleshooting command

On Download, **Troubleshooting command** displays the reproducible normal yt-dlp command. **Copy & open Termux** copies it and opens Termux but deliberately does not execute it; inspect the command, paste it and press Enter yourself. For LinkedIn fallback, transient signed CDN links remain hidden and are not exposed by this command.

## 16. Report an issue or crash

When safe, reproduce the problem once. Note what you expected and what actually happened, then open Diagnostics and choose **Copy complete diagnostic report** or **Share diagnostic report**.

A useful support report contains:

1. task you were doing;
2. website/URL if you are comfortable and authorised to share it;
3. Video/Audio/Pictures and important options;
4. expected result;
5. actual result/error;
6. approximate time;
7. complete diagnostic report.

After an app crash, CrashGuard can offer Send crash report on the next safe launch, or Keep for later / Discard. Reports are not transmitted automatically.

Never send cookie files, account passwords, activation PINs, administrator credentials, release keystores/private signing keys, signing passwords or recovery bundles.

Support: `information@ITthute.Africa`  
Website: `https://ITthute.Africa`

## 17. Security, privacy and activation

Use device authentication/App Lock where configured. **Lock now** locks immediately. Diagnostics and usage reports are reviewable and are not automatically transmitted. Activation status uses South African date/time and displays the current trial/activation state.

## 18. Quick support checklist

Before reporting a problem: confirm the URL works in a browser under the same account/session, confirm the selected download mode, retry only once after refreshing cookies or switching yt-dlp channel when appropriate, collect the complete diagnostics, and remove/avoid any private material before sharing.
