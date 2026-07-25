# v1.0.16 changed code summary

This file records the public source-level changes introduced in v1.0.16. The full generated source ZIP and patch are kept as build artifacts outside the public repository tree; this public repo records the reviewable change summary and the update manifest/checksums.

## Download tab troubleshooting command

New Download-tab state/UI:

```java
private TextView ytdlpCommandText;
private Button copyYtdlpCommandButton;
```

Every download attempt now stores a concrete command before the worker starts:

```java
String copyableYtDlpCommand = buildCopyableYtDlpCommand(audio, playlist, useCookies, output, url);
prefs.edit()
    .putString("last_ytdlp_command", copyableYtDlpCommand)
    .putString("last_ytdlp_command_job", jobId)
    .putString("last_ytdlp_command_time", timestamp)
    .apply();
```

The command builder emits a runnable Termux command including retry flags, archive path, cookies path when enabled, audio/video format options, progress templates, output template and source URL.

## Downloaded Media item actions

The item popup menu now contains:

```java
Open media
Rename file
Move file
Delete file
Copy file path
Refresh in Android media library
```

`Move file` runs a Termux-backed `mv` command that creates the target directory, prevents overwriting an existing file, updates the media index and refreshes Android media indexing.

`Delete file` requires confirmation, runs a Termux-backed `rm -f`, removes the stale media index entry, clears stored last-media references when needed and refreshes the media list.

## New Termux command types

```java
static final String TYPE_MEDIA_MOVE = "media_move";
static final String TYPE_MEDIA_DELETE = "media_delete";
```

## Regression coverage

`tests/source_regression_test.py` now checks:

- copyable yt-dlp command UI and persistence;
- command builder flags;
- media move/delete command types;
- Downloaded Media menu entries;
- Termux result markers for move/delete;
- stale-path cleanup for deleted files and path updates after move.
