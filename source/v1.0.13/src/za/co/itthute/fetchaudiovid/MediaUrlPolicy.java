package za.co.itthute.fetchaudiovid;

import java.net.URI;
import java.util.Locale;

public final class MediaUrlPolicy {
    private static final String[] BLOCKED_EXTENSIONS = new String[] {
            ".json", ".xml", ".txt", ".md", ".csv", ".css", ".js", ".apk", ".zip", ".pdf",
            ".doc", ".docx", ".xls", ".xlsx", ".ppt", ".pptx"
    };

    private MediaUrlPolicy() { }

    public static String validate(String value, String defaultUpdateFeed, String incorrectBlobFeed) {
        String url = value == null ? "" : value.trim();
        if (url.length() == 0) return "Enter or paste a media URL.";
        if (containsControlCharacter(url)) return "The URL contains invalid control characters.";

        final URI parsed;
        try {
            parsed = new URI(url);
        } catch (Exception e) {
            return "The URL is not correctly formatted.";
        }

        String scheme = safe(parsed.getScheme()).toLowerCase(Locale.US);
        if (!("http".equals(scheme) || "https".equals(scheme))) {
            return "The URL must start with http:// or https://.";
        }
        String host = safe(parsed.getHost()).toLowerCase(Locale.US);
        if (host.length() == 0) return "The URL must include a valid website host.";

        String full = url.toLowerCase(Locale.US);
        if (full.equals(safe(defaultUpdateFeed).toLowerCase(Locale.US))
                || full.equals(safe(incorrectBlobFeed).toLowerCase(Locale.US))) {
            return "That address is the app update feed, not a media URL. Paste the video or audio page address instead.";
        }

        String path = safe(parsed.getPath()).toLowerCase(Locale.US);
        for (int i = 0; i < BLOCKED_EXTENSIONS.length; i++) {
            if (path.endsWith(BLOCKED_EXTENSIONS[i])) {
                return "The URL points to a " + BLOCKED_EXTENSIONS[i].substring(1).toUpperCase(Locale.US)
                        + " document rather than a media page or media file.";
            }
        }

        if ((host.equals("raw.githubusercontent.com") || host.equals("gist.githubusercontent.com"))
                && !path.matches(".*\\.(mp4|m4v|mkv|webm|mov|avi|mp3|m4a|aac|wav|flac|ogg|opus)$")) {
            return "Raw GitHub content is not accepted as a media page. Paste the original video or audio page URL instead.";
        }
        return null;
    }

    private static boolean containsControlCharacter(String value) {
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c < 32 || c == 127) return true;
        }
        return false;
    }

    private static String safe(String value) {
        return value == null ? "" : value;
    }
}
