import za.co.itthute.fetchaudiovid.CookieFilePolicy;

public final class CookieFilePolicyTest {
    public static void main(String[] args) {
        String normal = ".instagram.com\tTRUE\t/\tTRUE\t2147483647\tsessionid\tabc123";
        String httpOnly = "#HttpOnly_.instagram.com\tTRUE\t/\tTRUE\t2147483647\tds_user_id\t12345";
        String header = "# Netscape HTTP Cookie File";
        String invalid = "not-a-cookie-line";

        if (!CookieFilePolicy.isValidNetscapeRecord(normal)) throw new AssertionError("Normal record rejected");
        if (!CookieFilePolicy.isValidNetscapeRecord(httpOnly)) throw new AssertionError("HttpOnly record rejected");
        if (CookieFilePolicy.isValidNetscapeRecord(header)) throw new AssertionError("Header accepted as record");
        if (CookieFilePolicy.isValidNetscapeRecord(invalid)) throw new AssertionError("Invalid line accepted");
        int count = CookieFilePolicy.countValidNetscapeRecords(header + "\n" + normal + "\n" + httpOnly + "\n" + invalid);
        if (count != 2) throw new AssertionError("Expected 2 records, got " + count);
        System.out.println("CookieFilePolicyTest: PASS");
    }
}
