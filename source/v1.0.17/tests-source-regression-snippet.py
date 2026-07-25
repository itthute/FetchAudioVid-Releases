# v1.0.17 source_regression_test.py metadata checks
check('Edit metadata' in MAIN and 'showEditMetadataDialog' in MAIN,
      "downloaded-media metadata edit menu/action missing")
check('TYPE_MEDIA_METADATA_READ = "media_metadata_read"' in BRIDGE and
      'TYPE_MEDIA_METADATA_WRITE = "media_metadata_write"' in BRIDGE,
      "metadata command types missing")
check('ffprobe -v error -print_format json -show_entries format_tags' in MAIN,
      "metadata read must use ffprobe format tags")
check('ffmpeg -hide_banner -y -i' in MAIN and '-metadata title=' in MAIN
      and '-metadata artist=' in MAIN and '-metadata genre=' in MAIN,
      "metadata write must use ffmpeg metadata tags")
check('Choose genre' in MAIN and 'Amapiano' in MAIN and 'Jazz' in MAIN and 'R&B' in MAIN,
      "common genre picker missing expected genres")
check('validateYearText' in MAIN and 'YYYY-MM-DD' in MAIN,
      "metadata year/date validation missing")
check('scanDownloadedMedia(file, file, true)' in MAIN,
      "metadata write should refresh Android media library")
