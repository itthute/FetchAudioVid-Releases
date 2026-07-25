# v1.0.17 metadata troubleshooting

If metadata saving fails:

1. Confirm full setup verification passes.
2. Confirm FFmpeg is installed.
3. Try saving only Title and Genre first.
4. Retry with a common MP3 file to distinguish app issues from container limitations.
5. Generate diagnostics immediately after the failure.

Common causes:

- the file was moved or deleted before saving;
- the file is read-only or inaccessible to Termux;
- the media container rejects metadata rewrite;
- the file is corrupt or incomplete;
- storage is full.

The app should preserve the original file when FFmpeg cannot produce a valid temporary output.
