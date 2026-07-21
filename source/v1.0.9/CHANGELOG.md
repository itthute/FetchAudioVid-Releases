# Changelog

## 1.0.9 — 2026-06-25

- Added a central, non-dismissible **Operation in progress** indicator for maintenance tasks that can take noticeable time.
- The indicator shows the current action, a clear explanation, an indeterminate progress bar and a live elapsed-time counter.
- The device screen is kept awake while the protected operation runs, and the modal indicator prevents accidental conflicting actions.
- Added one-tap **Copy current diagnostics** access inside the indicator for troubleshooting a slow or failed operation.
- Applied the indicator to dependency installation/repair, full verification, dependency update checks, guided upgrades, yt-dlp channel switching, media rename, data migration, cancellation, app-update checks, rollback backup, app-update APK download/verification, F-Droid Termux download and user-requested Android media rescans.
- Retained the existing live percentage/speed/ETA display for media downloads and inline loading state for the Downloaded Media browser, avoiding unnecessary modal interruptions.
- Added running-operation state and timing details to diagnostics, with automatic cleanup by the Termux result service even if the activity is not visible when a command completes.
- Updated the diagnostic report heading and network user-agent to the current ITthute Fetch AudioVid name.

## 1.0.8 — 2026-06-25

- Changed the Android package ID from `za.co.itthute.termuxdownloader` to `za.co.itthute.fetchaudiovid` for product-name consistency.
- Updated Java package declarations, source folders, manifest identity, generated resource references, Termux result action, diagnostics, About information, build notes, update-feed instructions and release documentation.
- Retained the established ITthute release-signing certificate. Because the package ID changed, Android installs 1.0.8 as a separate application rather than an in-place update of 1.0.7.
- Added a one-time migration notice when the older package is still installed, with a shortcut to its Android App info page.
- Added automatic safe filename normalisation for new downloads:
  - filenames are restricted to safe ASCII characters;
  - emojis and unsupported/special Unicode characters are removed;
  - spaces are converted to underscores;
  - the media ID remains in the filename to reduce collisions;
  - filename lengths are conservatively limited.
- Updated single-item and playlist output templates to use safe separators and shorter title limits.
- Retained newest-first sorting and downloaded-media renaming from 1.0.7.

## 1.0.7 — 2026-06-25

- Renamed the user-visible application to **ITthute Fetch AudioVid**.
- Added media-file renaming in the **Downloaded Media** tab.
- Confirmed newest-download-first ordering.

## 1.0.6 — 2026-06-24

- Added the Downloaded Media tab, playback chooser, stable/nightly yt-dlp switching, duplicate protection and URL-change status reset.
- Added a distinct Open downloaded media button after successful downloads.
- Added automatic Android media indexing and app update/rollback support.
