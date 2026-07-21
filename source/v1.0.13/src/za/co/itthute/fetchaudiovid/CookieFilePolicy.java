package za.co.itthute.fetchaudiovid;

public final class CookieFilePolicy {
    private CookieFilePolicy() { }

    public static int countValidNetscapeRecords(String content) {
        if (content == null || content.length() == 0) return 0;
        int count = 0;
        String[] lines = content.split("\\r?\\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if (isValidNetscapeRecord(line)) count++;
        }
        return count;
    }

    public static boolean isValidNetscapeRecord(String line) {
        if (line == null) return false;
        String trimmed = line.trim();
        if (trimmed.length() == 0) return false;
        if (trimmed.startsWith("#") && !trimmed.startsWith("#HttpOnly_")) return false;
        String[] fields = line.split("\\t", -1);
        if (fields.length < 7) return false;
        return fields[0].trim().length() > 0 && fields[5].trim().length() > 0;
    }
}
