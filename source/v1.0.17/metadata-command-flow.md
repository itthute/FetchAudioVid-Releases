# v1.0.17 metadata command flow

1. User opens **Downloaded Media**.
2. User opens a media item's `⋮` menu.
3. User chooses **Edit metadata**.
4. The app submits a Termux `media_metadata_read` command.
5. Termux runs FFprobe and returns existing tags to the app.
6. The app displays audio- or video-specific editable fields.
7. User saves changes.
8. The app submits a Termux `media_metadata_write` command.
9. Termux runs FFmpeg with stream copy into a temporary file.
10. The original file is replaced only if the temporary file exists and is non-empty.
11. Android media indexing is refreshed for the updated file.
12. The Downloaded Media list is refreshed.
