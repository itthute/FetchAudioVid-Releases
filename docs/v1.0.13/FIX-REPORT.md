# ITthute Fetch AudioVid 1.0.13 fix report

## Diagnostic drivers

Real device diagnostics from Samsung SM-S938B on Android 16 showed:

1. Instagram returned `empty media response` and requested cookies for restricted posts.
2. Facebook reels could fail with `Cannot parse data` from yt-dlp when Facebook returned unexpected page data.
3. The app previously allowed raw GitHub `update.json` to be treated as media and saved as `update_update.json`.
4. Android 16 blocked one ordinary background Termux service start with `BackgroundServiceStartNotAllowedException`.

## Fixes implemented

### Cookie support

Added optional website cookie import for Netscape-format `cookies.txt` files. Imported cookies are validated, copied into Termux and referenced with yt-dlp `--cookies` only when the user enables them.

Diagnostics expose only safe metadata:

- configured/enabled state;
- record count;
- import timestamp.

Cookie contents are not logged or included in diagnostics.

### URL validation

Added `MediaUrlPolicy` to block clearly non-media URLs before Termux is invoked. The app rejects update feeds, raw GitHub non-media content and document/archive extensions such as JSON, ZIP, APK, PDF, Office files and Markdown.

### Android 16 Termux launch handling

On Android 8 and later, the app starts Termux RUN_COMMAND through `startForegroundService()` and retains the warm-up recovery flow. This avoids the observed Android 16 background-service restriction for ordinary service starts.

### Failure clarity

Failures from restricted Instagram/Facebook content now remain failed instead of being misclassified as success. The UI guidance points the user toward authenticated browser cookies where appropriate.

## New regression coverage

- `CookieFilePolicyTest`: normal Netscape records, `#HttpOnly_` records, ignored headers and invalid lines.
- `MediaUrlPolicyTest`: valid Instagram/YouTube/direct media URLs, blocked update feed, blocked GitHub blob feed, blocked JSON/ZIP/raw GitHub, invalid scheme, missing host and control-character injection.
- Existing activation and download-state tests remain in place.

## Public repository exclusions

The following are intentionally excluded from public GitHub commits:

- release keystores;
- signing credentials;
- private release bundles;
- administrator plaintext password files;
- browser cookie files;
- user diagnostic reports.
