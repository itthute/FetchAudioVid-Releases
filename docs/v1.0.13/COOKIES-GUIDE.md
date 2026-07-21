# Secure website-cookie guide for ITthute Fetch AudioVid 1.0.13

Some Instagram, Facebook and other restricted posts cannot be downloaded anonymously. In those cases, yt-dlp may require an authenticated browser session exported as a Netscape-format `cookies.txt` file.

## Important limitation on Android

You cannot export cookies directly from the Facebook or Instagram Android app on a normal non-rooted phone. Those apps keep their sessions in private Android app storage. Use a browser session instead.

## Recommended Android approach

1. Install Firefox for Android.
2. Install a reputable `cookies.txt` add-on that exports Netscape HTTP Cookie File format.
3. Sign in to Facebook or Instagram inside Firefox.
4. Open the exact reel/post in Firefox and confirm that it plays there.
5. Export the cookies to a file named `cookies.txt`.
6. In ITthute Fetch AudioVid, open **Download → Website login cookies (optional)**.
7. Tap **Import Netscape cookies.txt**.
8. Select the exported file.
9. Enable **Use imported cookies for this download**.
10. Retry the restricted media URL.

## Expected diagnostics after import

Diagnostics should show cookie metadata only, for example:

```text
Website cookies configured: true
Website cookies enabled: true
Website cookie record count: <number greater than zero>
Website cookies imported at: <timestamp>
```

Cookie values must never appear in diagnostics.

## Security handling in the app

The app validates the imported file, copies it into Termux at:

```text
$HOME/.config/itthute-tmd/cookies.txt
```

The Termux copy is written with owner-only permissions, equivalent to Unix mode `600`.

## Security warnings

A cookie file can contain an active logged-in session. Anyone who obtains it may be able to access your account session.

Do not:

- upload `cookies.txt` to ChatGPT;
- upload it to GitHub;
- email it;
- send it by WhatsApp;
- leave it in a shared Downloads folder.

After importing, delete the browser-exported copy from Downloads. Use **Clear imported cookies** in the app when you no longer need authenticated downloads.

## If a download still fails

A post can still fail if it is deleted, private, region restricted, age restricted, inaccessible to the logged-in account, or affected by a new upstream extractor change. Generate a fresh diagnostic immediately after the failed authenticated attempt and confirm that cookies were configured and enabled.
