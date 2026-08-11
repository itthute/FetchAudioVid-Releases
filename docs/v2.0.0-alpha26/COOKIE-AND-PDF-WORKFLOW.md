# Alpha26 Cookie Insights and Pictures-to-PDF Workflow

## Cookie insight model

Fetch AudioVid keeps independent retained Netscape cookie profiles for Facebook, Instagram and LinkedIn. Alpha26 adds a safe inspection layer around those profiles.

For each configured profile the app can show its record count, the time Fetch AudioVid imported the export, the elapsed retained age, and whether that profile is the route selected for the current URL. A Termux-side inspection can additionally count unique domains, session records, persistent records, currently expired records, Secure records and HttpOnly records, and report the earliest/latest future expiry.

The insight layer never prints cookie names or cookie values. It should therefore be useful for troubleshooting without turning Diagnostics into an authentication-secret dump.

Interpretation matters: the import timestamp is the time the app retained the file; it is not the original login time. Netscape session cookies do not carry a fixed expiry timestamp. Persistent expiry timestamps are only hints about client-side record lifetime; a provider may invalidate a session sooner.

## PDF target selection

The source tree is selected first. Alpha26 resolves a best-effort shared-storage path and proposes its parent directory as the output target. The user can accept that parent, type a different target or browse to another target.

Android SAF permissions are URI/tree-scoped, so permission to read a source folder does not automatically authorize writing into its parent. When needed, the app asks the user to authorize the intended target once and reuses persisted writable access later.

## Cleanup invariants

When source-folder deletion is enabled:

1. the target must not equal the source directory;
2. the target must not be below the source directory;
3. the output PDF must be successfully written and reopened with a valid PDF header;
4. every selected image must have produced a page; a skipped/undecodable picture prevents cleanup;
5. only after those checks may the source tree be deleted;
6. failure to delete the source does not invalidate the completed PDF;
7. if source identity cannot be resolved safely, cleanup is disabled instead of guessing.

The deletion operation removes the entire selected source directory, including non-picture files such as `post-info.txt`.