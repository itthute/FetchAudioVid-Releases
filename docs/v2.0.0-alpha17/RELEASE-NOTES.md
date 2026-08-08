# ITthute Fetch AudioVid v2.0.0-alpha17 release notes

## Splitter
- Undo now records a snapshot only after a real slider gesture changes a range. Taps, aborted non-changing touches and vertical scrolling do not replace the useful undo point.
- A changed gesture that ends through touch cancellation is committed consistently for Undo.
- Divider mode now selects **90 seconds** by default; 30, 60, 90 and custom durations remain available.
- Splitter Settings now labels and explains maximum clip ranges, minimum clip length and maximum loaded-media duration.

## Usage and crash reports
- Diagnostics adds **Send app usage report**. It is generated locally, previewed before sending, and uses aggregate counts/non-secret settings only.
- Critical uncaught Java crashes are stored locally. On the next launch, the user can **Send crash report**, **Keep for later**, or **Discard**. Diagnostics can reopen a retained crash report.
- Nothing is transmitted automatically.

## Help and support
- Help is now a complete task guide for Download, cookies, Media Library, metadata, Splitter, Converter, Tools, Diagnostics, reporting, security, updates, activation and support.
- About includes **information@ITthute.Africa** and **https://ITthute.Africa**, with email and website actions.
