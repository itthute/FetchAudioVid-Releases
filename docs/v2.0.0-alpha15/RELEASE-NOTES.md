# ITthute Fetch AudioVid v2.0.0-alpha15

## User-facing improvements

### Splitter output-folder browsing
The **Save splitter clips** dialog now includes **Browse to target folder**. The selected Android folder is translated to a filesystem path usable by the Termux/FFmpeg splitter when the storage provider exposes such a path.

### Safer clip-range editing
Every clip range now includes **Lock clip N / Unlock clip N** and **Undo last slider move**. A locked range cannot be moved until explicitly unlocked. The range control waits for a deliberate horizontal drag before moving a handle, allowing normal vertical swipes to scroll the page.

### Dark-theme typing contrast
Editable text fields now use explicit high-contrast text, hint, border and background colours in dark mode.

### Expanded completed-download actions
The Download tab now provides **Playback downloaded media**, **Show downloaded media in Media Library**, **Edit downloaded media in Splitter**, **Edit downloaded media in Converter**, and **Locate downloaded media**.

## Diagnostic fixes

- Repairs Splitter/Converter source paths when yt-dlp removes an intermediate file during post-processing and a completed same-stem media file is available.
- Media Library requests use generation tokens so stale timeouts/results cannot interfere with the latest listing request.
- One-file Android media refreshes no longer fall back to the previous batch scan list.

## Compatibility

- Package: `za.co.itthute.fetchaudiovid`
- Version code: `20014`
- Minimum Android API: `26`
- Target Android API: `28`
- Signer SHA-256: `9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf`
