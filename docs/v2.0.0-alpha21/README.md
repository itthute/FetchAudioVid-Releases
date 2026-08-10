# ITthute Fetch AudioVid v2.0.0-alpha21

Package: `za.co.itthute.fetchaudiovid`  
Version code: `20020`

Alpha21 remediates the Picture/Post Images failures reported during alpha20 testing.

## Main fixes

- The download poller now follows the actual `LOG=` path written by the job. Picture failures therefore expose the true `pictures-<job>.log` tail instead of an empty diagnostic section.
- Facebook redirect/share URLs are canonicalised before gallery extraction, with imported Netscape cookies reused when enabled.
- Picture failures are classified into actionable authentication/login, HTTP 403, HTTP 429/rate-limit, unsupported URL, unresolved share URL and no-still-image cases.
- The embedded LinkedIn extractor recognises login/authwall/checkpoint responses and current LinkedIn media CDN URL forms.
- Dependency verification now persists the installed `gallery-dl` version used by Diagnostics.
- Alpha20's ordered sub-folder output, zero-padded filenames, optional `post-info.txt`, retry behavior and exact-path media publication are retained.
- Alpha18's Splitter touch-dispatch safety invariant remains protected.

## Authentication

Old/restricted social-media posts can require current browser cookies. Import a fresh Netscape `cookies.txt` from a browser session that can view the target post and enable **Use imported cookies for this download** when the app reports an authentication requirement.

## Build identity

```text
Signed APK SHA-256:
01a145f15e1435dbe90aec989cc223069533d7ce266703b478fdd9acd18e32fa

Signer certificate SHA-256:
9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf
```

A deliberately unsigned practice APK was produced privately for signing practice. It is not committed to this public repository.

The production `update.json` remains unchanged while alpha21 is under test.
