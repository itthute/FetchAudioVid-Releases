# v1.0.17 metadata regression checks

The v1.0.17 source-regression checks assert that:

- the app identity is `1.0.17 / 10017`;
- `Edit metadata` is present in the Downloaded Media menu;
- metadata read/write command types are present in `TermuxBridge`;
- FFprobe is used to read `format_tags`;
- FFmpeg is used to write `title`, `artist`, `genre` and related metadata;
- the common genre picker includes expected entries such as Amapiano, Jazz and R&B;
- year/date validation accepts `YYYY`, `YYYY-MM` and `YYYY-MM-DD`;
- Android media scanning runs after metadata is saved;
- previous v1.0.16 yt-dlp troubleshooting command, media move/delete actions and v1.0.15 domain checker remain intact.

The test suite passed before the APK was signed.
