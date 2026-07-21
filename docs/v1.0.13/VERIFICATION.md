# ITthute Fetch AudioVid 1.0.13 verification summary

## Build identity

```text
Package: za.co.itthute.fetchaudiovid
Version: 1.0.13
Version code: 10013
Minimum Android API: 26
APK SHA-256: e546e496ea86274ce7b221fcf89cb3b092aa146511f778424cf994f275875947
Signer SHA-256: f1bd567df37fa936585c37c6041d152f183c32cb9ac0ddf2588256ba1460af2a
```

## Automated checks passed

- Clean Java compilation against Android platform 28.
- Fresh DEX generation.
- APK archive integrity.
- Four-byte ZIP alignment.
- Manifest and package parsing.
- DEX header and class parsing.
- APK Signature Scheme v2 verification.
- Signer comparison with the working clean-build 1.0.12 APK.
- Public artifact scan for private keys, signing passwords, administrator plaintext credentials and cookie data.

## Test suite passed

- `LicensePolicyTest`
- `ActivationScenarioTest`
- `MediaUrlPolicyTest`
- `CookieFilePolicyTest`
- `JavaSyntaxCheck`
- Embedded source regression simulations for completed downloads, duplicates, empty-output failures, HTTP 403 retry, partial-file reporting and MediaStore URI handling.

## Device-side validation still required

The automated build checks cannot replace physical-device validation. Confirm on Samsung Android 16:

1. App launches.
2. Authentication dialog works.
3. Full setup verification passes.
4. Termux RUN_COMMAND starts without background-service exception.
5. Public download succeeds.
6. Duplicate prevention works.
7. Raw `update.json` is rejected before yt-dlp runs.
8. Imported cookies show only safe metadata in diagnostics.
