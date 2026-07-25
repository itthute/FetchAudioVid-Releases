# v1.0.17 public release safety note

The public repository update intentionally includes only release notes, verification summaries, update-manifest examples and source-change notes.

Do not publish:

- `.p12`, `.jks` or `.keystore` files;
- private signing bundles;
- signing passwords;
- administrator plaintext credential files;
- browser cookies;
- diagnostics copied from a user's device;
- downloaded media files.

The signed APK and full source ZIP were produced in the build workspace and should be published as GitHub Release assets only after manual review.
