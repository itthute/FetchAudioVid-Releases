import za.co.itthute.fetchaudiovid.MediaUrlPolicy;

public final class MediaUrlPolicyTest {
    private static final String RAW = "https://raw.githubusercontent.com/itthute/FetchAudioVid-Releases/main/update.json";
    private static final String BLOB = "https://github.com/itthute/FetchAudioVid-Releases/blob/main/update.json";

    public static void main(String[] args) {
        ok("https://www.instagram.com/reel/DZuZqEwMPJ4/?igsh=abc");
        ok("https://www.youtube.com/watch?v=lSzICmwmRsA");
        ok("https://cdn.example.org/media/video.mp4?token=abc");
        ok("http://example.org/watch/123");

        fail(RAW, "update feed");
        fail(BLOB, "update feed");
        fail("https://example.org/config.json", "JSON document");
        fail("https://example.org/archive.zip?download=1", "ZIP document");
        fail("https://raw.githubusercontent.com/example/repo/main/README", "Raw GitHub");
        fail("file:///storage/emulated/0/video.mp4", "http:// or https://");
        fail("https:///missing-host", "valid website host");
        fail("https://example.org/video\nhttps://evil.example", "control characters");
        System.out.println("MediaUrlPolicyTest: PASS");
    }

    private static void ok(String url) {
        String result = MediaUrlPolicy.validate(url, RAW, BLOB);
        if (result != null) throw new AssertionError("Expected valid URL, got: " + result + " for " + url);
    }

    private static void fail(String url, String expected) {
        String result = MediaUrlPolicy.validate(url, RAW, BLOB);
        if (result == null || !result.toLowerCase().contains(expected.toLowerCase())) {
            throw new AssertionError("Expected failure containing '" + expected + "', got: " + result);
        }
    }
}
