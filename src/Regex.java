import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Brian Nguyen
 */
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

    public static boolean isEmail(final String theInput) {
        return regex(".+@.+\\..+", theInput) && !regex(".*@.*@.*", theInput);
    }

    public static boolean isRosterName(final String theInput) {
        return regex("\\w*['\\s-]?\\w*\\.?,\\s?\\w+,?\\s?\\w*", theInput);
    }

    public static boolean isDate(final String theInput) {
        if (!regex("\\d{2}[/-]\\d{2}[/-]\\d{4}", theInput) ||
            (regex("00........", theInput) ||
            regex("...00.....", theInput) ||
            regex("......0000", theInput)
            )
        ) return false;
        boolean thirtyOne =
                regex("((0[13578])|(1[02])).[0-2][0-9].\\d{4}", theInput) ||
                regex("((0[13578])|(1[02])).[3][0-1].\\d{4}", theInput);
        boolean thirty =
                regex("((0[469])|(11)).[0-2][0-9].\\d{4}", theInput) ||
                regex("((0[469])|(11)).30.\\d{4}", theInput);
        boolean feb;
        int yearNum = Integer.parseInt(theInput.substring(6));
        if ((regex(".......000", theInput) && yearNum % 400 == 0) || yearNum % 4 == 0) {
            //LEAP YEAR
            feb = regex("(02).[0-1][0-9].\\d{4}", theInput)||
                regex("(02).2[0-9].\\d{4}", theInput);
        } else //NOT LEAP YEAR
            feb = regex("(02).[0-1][0-9].\\d{4}", theInput) ||
                regex("(02).2[0-8].\\d{4}", theInput);
        return thirtyOne || thirty || feb;
    }

    public static boolean isAddress(final String theInput) {
        return regex("\\d{4}\\s.+\\s[rR]([oO][aA])?[dD]\\.?", theInput) ||
                regex("\\d{4}\\s.+\\s[bB][oO]?[uU]?[lL][eE]?[vV][aA]?[rR]?[dD]\\.?", theInput) ||
                regex("\\d{4}\\s.+\\s[sS][tT][rR]?[eE]?[eE]?[tT]?\\.?", theInput) ||
                regex("\\d{4}\\s.+\\s[aA][vV][eE][nN]?[uU]?[eE]?\\.?", theInput) ||
                regex("\\d{4}\\s.+\\s[wW][aA][yY]\\.?", theInput);
    }

    public static boolean isCityStateZip(final String theInput) {
        return regex(".+,\\s+[A-Z]{2}\\s\\d{5}-?\\d*", theInput);
    }

    public static boolean isMilitaryTime(final String theInput) {
        return regex("[0-1][0-9][0-5][0-9]", theInput) ||
                regex("2[0-3][0-5][0-9]", theInput);
    }

    public static boolean isUSCurrency(final String theInput) {
        return regex("^\\$\\d{0,3}(,?\\d{3})*\\.\\d\\d", theInput);
    }

    public static boolean isURL(final String theInput) {
        if (regex(".*\\s.*",theInput) || !regex("[^\\.].*[^\\.]$", theInput)) return false;
        return regex("(https?://)?[^A-Z]*\\.[^A-Z]*", theInput);
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
