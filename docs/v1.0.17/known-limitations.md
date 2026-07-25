# v1.0.17 known limitations

Metadata support depends on the media container and FFmpeg's ability to rewrite tags without re-encoding.

Expected behaviour:

- MP3 metadata is usually written as ID3 tags.
- M4A/MP4 metadata support depends on the container and player.
- Some video players may display only a subset of metadata fields.
- Some containers may reject one or more tags even though the file remains playable.

The app shows a short FFmpeg log tail when a metadata write fails. Generate diagnostics immediately after failure for troubleshooting.
