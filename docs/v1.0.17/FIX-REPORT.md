# ITthute Fetch AudioVid 1.0.17 — metadata editing

## User request

Add an entry to the Downloaded Media tab item menu that enables the user to edit metadata such as artist, title, genre, album and year. The editable fields should depend on whether the file is audio or video. The genre field should offer common genres while still allowing typed custom genres.

## Changes implemented

### Downloaded Media menu

Added **Edit metadata** to each listed media file's popup menu.

### Metadata read flow

When a user chooses **Edit metadata**, the app asks Termux to run FFprobe against the selected file and returns format tags safely using Base64 transport. If existing tags are present, they prepopulate the edit form.

### Audio form

Audio files expose title, artist, album, album artist, genre, year/date, track number and comment.

### Video form

Video files expose title, creator/artist, genre, year/date and description/comment.

### Genre picker

The genre field remains free-typing but includes a chooser with common genres, including South African and global categories.

### Metadata write flow

The app writes tags through FFmpeg using stream copy, replacing the original file only after FFmpeg produces a non-empty temporary output. Android media indexing is refreshed afterward.

## Failure handling

The app shows user-friendly messages for missing source files, missing FFmpeg/FFprobe, FFmpeg failures and replacement failures. A short FFmpeg log tail is retained in the visible error message for troubleshooting.

## Verification

- Java syntax check: PASS
- License tests: PASS
- Activation tests: PASS
- Media URL policy tests: PASS
- Cookie policy tests: PASS
- Source regression tests: PASS
- Clean Java compilation: PASS
- Fresh DEX generation: PASS
- APK archive integrity: PASS
- APK Signature Scheme v2 verification: PASS
- Replacement signer match: PASS
- Public artifact secret scan: PASS
