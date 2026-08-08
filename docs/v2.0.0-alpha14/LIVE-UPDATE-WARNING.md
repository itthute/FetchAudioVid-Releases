# Live update warning for v2.0.0-alpha14

`v2.0.0-alpha14` is currently documented as an **alpha/test build**.

The repository's live production `main/update.json` is intentionally unchanged. The file `update-v2.0.0-alpha14.example.json` is an example manifest only and its GitHub Release APK URL should not be activated until the matching signed APK has been published as a release asset and independently verified.

Before promoting alpha14 to an update channel, verify all of the following:

1. the intended release channel is confirmed;
2. a GitHub Release/tag for `v2.0.0-alpha14` exists;
3. the signed APK is available at the manifest URL;
4. the downloaded APK SHA-256 is `9546c93d3e8a2888cfd708022ea69aa6afdde4708a69be5f83794957874fb23c`;
5. the signer certificate SHA-256 is `9df337ed2d87f165b60352f8c1e81ae070ad3905a6c67a0a90f766f39025c7cf`;
6. device acceptance tests pass.
