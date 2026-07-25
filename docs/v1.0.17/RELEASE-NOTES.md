# ITthute Fetch AudioVid 1.0.17 release notes

Version 1.0.17 improves post-download media management.

## New feature: edit metadata

The **Downloaded Media** tab item menu now includes **Edit metadata**.

Audio files allow editing:

- Title
- Artist
- Album
- Album artist
- Genre
- Year / date
- Track number
- Comment

Video files allow editing:

- Title
- Creator / artist
- Genre
- Year / date
- Description / comment

The genre field is editable and also has a **Choose genre** button with common genres such as Amapiano, Afro House, Afrobeats, Blues, Classical, Gospel, Hip-Hop, Jazz, Kwaito, Pop, R&B, Reggae, Rock, Soul and Traditional.

## Implementation notes

- Existing tags are read using FFprobe.
- Updated tags are written using FFmpeg with stream copy where the container supports metadata rewrite.
- The app refreshes Android media indexing after saving metadata.
- The feature is available only for common audio/video files recognised by the app.

## Retained fixes

This release retains the working 1.0.16 copyable yt-dlp command, move/delete media menu actions, v1.0.15 domain-resolution checker and v1.0.14 diagnostic share fix.

## Build identity

```text
Package: za.co.itthute.fetchaudiovid
Version: 1.0.17
Version code: 10017
```
