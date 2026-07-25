# ITthute Fetch AudioVid 1.0.16 — troubleshooting command and media actions

## Request addressed

The user asked for two improvements after confirming 1.0.15 works:

1. When a download fails, show the exact `yt-dlp` command that was run and provide a copy button for direct Termux troubleshooting.
2. Add **Delete** and **Move** functions to the Downloaded Media item submenu.

## Implementation summary

### Copyable yt-dlp command

The Download tab now contains a **Troubleshooting command** section. Every download attempt stores a concrete, copyable `yt-dlp` command in app preferences before the background worker starts. The command includes retry options, archive file path, playlist/single-item scope, cookies option when enabled, audio/video format options, progress and postprocess templates, output template and source URL.

A **Copy last yt-dlp command** button copies this command to Android clipboard for direct execution in Termux.

### Downloaded Media move/delete

The Downloaded Media `⋮` menu now includes:

- **Move file** — prompts for a destination folder, creates it if needed, prevents overwriting an existing file, moves the file via Termux, updates the app media index, updates stored last-media paths and refreshes Android media indexing.
- **Delete file** — prompts for confirmation, deletes via Termux, updates the app media index, clears stale last-media references, refreshes Android media indexing and refreshes the list.

### Safety controls

- Move refuses to overwrite an existing destination file.
- Delete requires explicit confirmation.
- Operations run through the existing Termux command bridge and keep app-private signing/cookie data out of public logs.
- Diagnostics only reports whether a command is available; it does not include cookie contents.

## Verification performed

- Java syntax parse: PASS
- Java compilation against Android 28: PASS
- DEX generation: PASS
- Source regression tests: PASS
- License tests: PASS
- Activation tests: PASS
- Media URL policy tests: PASS
- Cookie-file policy tests: PASS
- APK archive integrity: PASS
- ZIP alignment: PASS
- APK Signature Scheme v2 verification: PASS
- Signer SHA-256 match with replacement release key: PASS
- Public artifact secret scan: PASS

## Remaining physical checks

Physical-device validation should confirm:

- **Copy last yt-dlp command** copies a runnable command.
- Move succeeds between real shared-storage folders.
- Delete removes a test media file and refreshes the list.