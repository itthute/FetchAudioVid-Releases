# Metadata editing implementation notes

## Menu entry

The Downloaded Media popup menu now adds `Edit metadata` between `Rename file` and `Move file`.

## Metadata read

The read operation is submitted to Termux as `media_metadata_read`. It verifies that the file exists and that `ffprobe` is available, then returns `format_tags` as JSON encoded with Base64.

## Metadata form

The app chooses fields by media type:

### Audio

- Title
- Artist
- Album
- Album artist
- Genre
- Year/date
- Track number
- Comment

### Video

- Title
- Creator / artist
- Genre
- Year/date
- Description / comment

## Genre handling

The genre field is an editable text field with a `Choose genre` button. The list includes common local and global genres such as Amapiano, Afro House, Afrobeats, Gospel, Hip-Hop, Jazz, Kwaito, R&B, Reggae, Rock and Soul. Users can type any custom genre instead of selecting from the list.

## Metadata write

The write operation is submitted to Termux as `media_metadata_write`. It uses FFmpeg with stream copy so the media is not re-encoded. A temporary output file is created first; the original is replaced only after FFmpeg produces a non-empty result.

## Media refresh

After a successful metadata write, the app calls Android media scanning for the updated file so media apps can see the changed tags.
