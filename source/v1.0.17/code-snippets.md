# v1.0.17 selected code snippets

## Downloaded Media menu

```java
menu.getMenu().add("Open media");
menu.getMenu().add("Rename file");
menu.getMenu().add("Edit metadata");
menu.getMenu().add("Move file");
menu.getMenu().add("Delete file");
menu.getMenu().add("Copy file path");
menu.getMenu().add("Refresh in Android media library");
```

## Menu handler

```java
if (label.startsWith("Open")) openMediaPathWithChooser(file);
else if (label.startsWith("Rename")) showRenameMediaDialog(file);
else if (label.startsWith("Edit metadata")) readMediaMetadata(file);
else if (label.startsWith("Move")) showMoveMediaDialog(file);
else if (label.startsWith("Delete")) confirmDeleteMediaFile(file);
```

## FFprobe read path

```sh
ffprobe -v error -print_format json -show_entries format_tags "$FILE"
```

## FFmpeg write path

```sh
ffmpeg -hide_banner -y -i "$FILE" -map 0 -c copy \
  -metadata title="$TITLE" \
  -metadata artist="$ARTIST" \
  -metadata genre="$GENRE" \
  -metadata date="$YEAR" \
  "$TMP"
```

## Result handling

The app replaces the original only after FFmpeg produces a non-empty temporary file, then refreshes Android media indexing for the updated file.
