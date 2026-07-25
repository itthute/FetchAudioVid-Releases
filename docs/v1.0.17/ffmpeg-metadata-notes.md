# FFmpeg metadata notes for v1.0.17

The metadata editor uses FFmpeg with stream copy, so it does not intentionally re-encode audio or video streams.

Important behaviour:

- FFmpeg writes tags only when the target container supports them.
- Player apps may display different subsets of tags.
- Some containers may preserve playback but ignore unsupported fields.
- If FFmpeg cannot rewrite the file, the app does not replace the original.
- A short FFmpeg log tail is shown for troubleshooting failures.

This approach keeps metadata editing lightweight and avoids unnecessary media quality loss.
