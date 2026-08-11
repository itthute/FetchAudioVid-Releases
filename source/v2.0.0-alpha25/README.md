# Source notes — v2.0.0-alpha25

Alpha25 is based on alpha24 and changes the LinkedIn Video fallback authentication decision order and related Help/testing documentation.

Key source changes:

- versionName `2.0.0-alpha25`, versionCode `20024`;
- LinkedIn fallback request includes LinkedIn Referer/browser-like headers;
- media candidates are scanned before auth classification;
- strong login URL/form checks replace broad incidental-text rejection;
- JSON media scanning includes `<script>` as well as `<code>` blocks;
- `LinkedInFallbackBehaviorTest` covers misleading auth wording plus valid video metadata and a genuine login-form control case;
- alpha18 Splitter touch-dispatch guard remains unchanged.

Full source ZIP SHA-256:
`e68107f9e81334a1599bca4d5a8f9db7ebee03446e7ff28ebe6a99517bfc6a02`

Alpha24→alpha25 full patch SHA-256:
`5f6c055b178f18d5a5f708b301c8e1b027639e27f741fbf88c8b7d18bdca6fc0`

Private signing files, cookies, diagnostic reports and temporary signed LinkedIn media URLs are intentionally excluded.
