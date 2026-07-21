# ITthute Fetch AudioVid 1.0.9

ITthute Fetch AudioVid is a secure Android front end for yt-dlp running in a compatible F-Droid/GitHub Termux environment. It downloads authorised video or audio, shows live progress, prevents recorded duplicates, indexes completed files for Android media apps and provides guided maintenance and diagnostics.

## Android package identity

Version 1.0.8 established the Android package ID to:

```text
za.co.itthute.fetchaudiovid
```

The app label is:

```text
ITthute Fetch AudioVid
```

Android treats different package IDs as different applications. Version 1.0.8 therefore installs alongside 1.0.7 instead of updating it in place. The same ITthute signing certificate is retained so that 1.0.8 establishes the trusted update line for future releases using `za.co.itthute.fetchaudiovid`.

After verifying the new package line, the older application may be uninstalled. Do not uninstall Termux. Downloaded media and the shared folder under `/storage/emulated/0/Download/ITthute Fetch AudioVid` remain outside either app's private storage.

## Main features

- ITthute-branded Android app with the supplied Africa logo.
- URL paste and Android share-target support.
- Video download mode with MP4 preference where merging or conversion permits.
- Audio extraction mode with MP3 output.
- Single-item and playlist mode.
- User-selected shared-storage destinations.
- Safe ASCII filename policy for new downloads.
- Live percentage, speed, ETA, post-processing and playlist progress.
- Automatic Android media-library indexing after completed downloads.
- Open and locate completed media.
- Downloaded Media tab with newest-first file list.
- Rename media files from the Downloaded Media tab.
- Duplicate protection using yt-dlp archive and internal media index.
- Stable/nightly yt-dlp channel switching.
- Guided Termux migration from unsupported builds.
- Automatic dependency setup, verification and update checks.
- App update feed, APK hash verification and rollback guidance.
- OS-backed app lock using biometrics or device PIN/password.
- Copyable and shareable diagnostics.
- Long-running-operation indicator for setup, update and maintenance tasks.

## Requirements

- Android 8.0/API 26 or newer.
- F-Droid or GitHub Termux. The Google Play Termux line does not provide the required external command interface.
- Termux `allow-external-apps=true`.
- Android permission: `Run commands in Termux environment`.
- Termux packages:
  - `python`
  - `python-pip`
  - `ffmpeg`
  - `deno`
- Python package:
  - `yt-dlp[default]`

The app can guide the user through most of this setup once compatible Termux is installed.

## Filename policy

New downloads use a safe ASCII naming policy:

- emojis and unsupported Unicode symbols are removed;
- unsafe special characters are removed;
- spaces become underscores;
- media IDs are retained;
- very long names are trimmed.

This reduces Android file-manager problems with emojis, punctuation and extremely long social-media titles.

## Application folders

Default media destinations:

```text
/storage/emulated/0/Download/ITthute Fetch AudioVid
/storage/emulated/0/Movies/ITthute Fetch AudioVid
/storage/emulated/0/Music/ITthute Fetch AudioVid
```

Application logs and state:

```text
/storage/emulated/0/Download/ITthute Fetch AudioVid/
├── jobs/
├── logs/
│   ├── downloads/
│   └── setup/
├── state/
└── updates/
```

## Source layout

```text
AndroidManifest.xml
src/za/co/itthute/fetchaudiovid/
├── CrashGuardApplication.java
├── MainActivity.java
├── TermuxBridge.java
└── TermuxResultService.java
res/drawable/
├── app_icon.xml
└── itthute_logo.png
build.sh
```

## Build notes

This project is intentionally dependency-light and uses standard Android framework classes. The included `build.sh` expects Android build tools and platform files to be present in the local build environment.

For repeatable production builds, keep the signing certificate private. Do not commit private signing keys or private signing backup ZIP files to a public repository.

## Installation

Install `ITthuteFetchAudioVid-v1.0.9.apk` over version 1.0.8 and choose **Update**. Version 1.0.9 keeps the same package ID and signing certificate.

For the one-time move from version 1.0.7 or older:

1. Install version 1.0.9 alongside the old application.
2. Grant `Run commands in Termux environment`.
3. Run setup verification.
4. Confirm downloads work.
5. Uninstall only the older application.
6. Do not uninstall Termux.

## Verified identity

- Application label: `ITthute Fetch AudioVid`
- Package ID: `za.co.itthute.fetchaudiovid`
- Version name: `1.0.9`
- Minimum Android API: `26`

## Safety note

Use the app only for media you own, are authorised to download, or may lawfully save. Websites may restrict downloading in their terms.