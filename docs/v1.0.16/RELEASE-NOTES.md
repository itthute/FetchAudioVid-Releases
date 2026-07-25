# ITthute Fetch AudioVid 1.0.16 release notes

Version 1.0.16 is a usability and troubleshooting release on top of the working 1.0.15 build.

## Added

- Download tab now shows the exact copyable `yt-dlp` command generated for the most recent download attempt.
- A **Copy last yt-dlp command** button copies that command so it can be pasted directly into Termux during troubleshooting.
- Downloaded Media item menu now includes **Move file** and **Delete file** actions, in addition to open, rename, copy path and refresh.
- Move action creates the destination folder when needed, prevents overwriting an existing file, updates the media index and refreshes Android media indexing.
- Delete action confirms before removal, deletes through Termux, updates stored last-media state, updates the media index and refreshes the list.
- Diagnostics now records whether a copyable yt-dlp command is available without exposing private cookies.

## Preserved

- Package ID: `za.co.itthute.fetchaudiovid`
- Version code: `10016`
- Version name: `1.0.16`
- Replacement signer: unchanged from the 1.0.12/1.0.13/1.0.14/1.0.15 line
- Termux RUN_COMMAND flow: unchanged except for the new media action commands
- Cookie privacy: cookie values are still never logged or included in diagnostics

## Acceptance tests

After updating from 1.0.15:

1. Run full setup verification.
2. Start a download and confirm the Download tab shows a copyable `yt-dlp` command.
3. Tap **Copy last yt-dlp command**, paste it into Termux and confirm it is syntactically usable.
4. Open Downloaded Media, use the item menu to copy a path and refresh an item.
5. Move a test media file to another shared folder and confirm the list refreshes.
6. Delete a test media file and confirm it disappears from the list.
7. Confirm Diagnostics still shares successfully.