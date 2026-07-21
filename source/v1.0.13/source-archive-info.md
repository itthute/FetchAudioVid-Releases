# ITthute Fetch AudioVid 1.0.13 source archive information

This public source snapshot corresponds to the final v1.0.13 source bundle generated during the Android 16/Instagram/Facebook hardening work.

Expected source archive:

```text
ITthuteFetchAudioVid-v1.0.13-FINAL-source.zip
SHA-256: abbc8df13b90844d1c06f6ca74b09c317c92e528e0220e9ab4cf59bea3ef57fb
```

The archive contains:

```text
AndroidManifest.xml
BUILD-NOTES.txt
CHANGELOG.md
COOKIES-GUIDE.md
FIX-REPORT.md
INSTALL.txt
NEW-SIGNER-NOTES.txt
README.md
RELEASE-SIGNING.txt
UPDATE-GUIDE.md
UPDATE-MANIFEST.example.json
build.sh
res/drawable/app_icon.xml
res/drawable/itthute_logo.png
sign-release.sh
src/za/co/itthute/fetchaudiovid/CookieFilePolicy.java
src/za/co/itthute/fetchaudiovid/CrashGuardApplication.java
src/za/co/itthute/fetchaudiovid/LicensePolicy.java
src/za/co/itthute/fetchaudiovid/MainActivity.java
src/za/co/itthute/fetchaudiovid/MediaUrlPolicy.java
src/za/co/itthute/fetchaudiovid/TermuxBridge.java
src/za/co/itthute/fetchaudiovid/TermuxResultService.java
tests/ActivationScenarioTest.java
tests/CookieFilePolicyTest.java
tests/JavaSyntaxCheck.java
tests/LicensePolicyTest.java
tests/MediaUrlPolicyTest.java
tests/run-tests.sh
tests/source_regression_test.py
```

## Source changes of interest

The v1.0.13 work introduced two small policy classes that are mirrored directly in this repository for quick review:

- `source/v1.0.13/src/za/co/itthute/fetchaudiovid/CookieFilePolicy.java`
- `source/v1.0.13/src/za/co/itthute/fetchaudiovid/MediaUrlPolicy.java`

The full generated source package should be attached to a GitHub Release or uploaded by a workstation with normal `git`/GitHub Release tooling.

## Exclusions

The public source snapshot must not include:

- release keystores;
- private signing bundles;
- plaintext signing passwords;
- administrator plaintext credential files;
- browser cookies;
- user diagnostics.
