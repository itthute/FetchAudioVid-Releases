# v1.0.17 changed-code summary

This summary records the public code changes made for ITthute Fetch AudioVid 1.0.17.

## MainActivity.java

Added **Edit metadata** to the Downloaded Media popup menu:

```java
menu.getMenu().add("Edit metadata");
...
else if (label.startsWith("Edit metadata")) readMediaMetadata(file);
```

Added metadata read handling through Termux/FFprobe:

```java
ffprobe -v error -print_format json -show_entries format_tags "$FILE"
```

Added an audio/video-specific edit dialog:

- audio: title, artist, album, album artist, genre, year/date, track, comment;
- video: title, creator/artist, genre, year/date, description/comment.

Added a common genre chooser while keeping the genre field manually editable.

Added metadata write handling through Termux/FFmpeg:

```java
ffmpeg -hide_banner -y -i "$FILE" -map 0 -c copy \
  -metadata title="$TITLE" \
  -metadata artist="$ARTIST" \
  -metadata genre="$GENRE" \
  -metadata date="$YEAR" \
  ...
```

The write path creates a temporary file in the same folder, confirms that FFmpeg produced a non-empty output, then replaces the original file and refreshes Android media indexing.

## TermuxBridge.java

Added command result types:

```java
TYPE_MEDIA_METADATA_READ = "media_metadata_read"
TYPE_MEDIA_METADATA_WRITE = "media_metadata_write"
```

## Regression tests

`source_regression_test.py` now checks:

- the metadata menu item and handler are present;
- FFprobe is used for metadata reads;
- FFmpeg metadata tags are used for writes;
- common genre picker entries are present;
- year/date validation is present;
- Android media indexing is refreshed after metadata saves.

## Security

No private signing key, signing credential, administrator plaintext password, cookies, user diagnostics or user media were committed.
