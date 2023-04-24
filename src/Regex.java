import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {}

    public static boolean isSSN(final String theInput) {
        return regex( "\\d{3}-\\d{2}-\\d{4}", theInput) ||
                regex("\\d{9}", theInput) ||
                regex("\\d{3}\\s\\d{2}\\s\\d{4}", theInput);
    }

    public static boolean isPhoneNumber(final String theInput) {
        return regex( "\\d{3}-?\\d{3}-?\\d{4}", theInput) ||
                regex("\\(\\d{3}\\)\\d{3}-?\\d{4}", theInput) ||
                regex("\\d{10}", theInput);
    }

    /*
    NO periods at beginning or end of name
    No two periods consecutive
    Need @ char
    INCOMPLETE
     */
    public static boolean isEmail(final String theInput) {
        String[] split = theInput.split("@");
        if (split.length > 2) return false;
        String local = split[0];
        String domain = split[1];
        boolean l = regex("^[^\\.].+[^\\.]$",local);
        boolean d = regex(".+\\..+", domain);
        return l&&d;
    }
    public static boolean isRosterName(final String theInput) {
        return regex("\\w*['\\s-]?\\w*\\.?,\\s?\\w+,?\\s?\\w*", theInput);
    }
    public static boolean isDate(final String theInput) {
        return regex("", theInput);
    }
    public static boolean isAddress(final String theInput) {
        return regex("", theInput);
    }
    public static boolean isCityStateZip(final String theInput) {
        return regex("", theInput);
    }
    public static boolean isMilitaryTime(final String theInput) {
        return regex("", theInput);
    }
    public static boolean isUSCurrency(final String theInput) {
        return regex("", theInput);
    }
    public static boolean isURL(final String theInput) {
        return regex("(https?://)?^[wW]{3}?\\.?.*\\..*", theInput);
    }
    public static boolean isPassword(final String theInput) {
        if (theInput.length() < 10) return false;
        return
                regex(".*\\d.*", theInput) &&
                regex(".*[a-z].*", theInput) &&
                regex(".*[A-Z].*", theInput) &&
                regex(".*[!?,\\.].*", theInput) &&
                !regex(".*[a-z]{4}.*", theInput);
    }
    public static boolean isOddion(final String theInput) {
        if (theInput.length() % 2 == 0) return false;
        return regex("[A-z-]*[iI][oO][nN]", theInput);
    }

    public static boolean regex(final String theRegex, final String theInput) {
        Pattern p = Pattern.compile(theRegex);
        Matcher m = p.matcher(theInput);
        return m.matches();
    }
}
