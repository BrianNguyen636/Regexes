import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    void validDateDashes() {
        Assertions.assertTrue(RegexScreener.isDateMMDDYYYYY("04-23-2023"));
    }

    @Test
    void validDateSlashes() {
        Assertions.assertTrue(RegexScreener.isDateMMDDYYYYY("04/23/2023"));
    }

    @Test
    void validDateJanuary1() {
        Assertions.assertTrue(RegexScreener.isDateMMDDYYYYY("01/01/2023"));
    }

    @Test
    void validDateDecember31() {
        Assertions.assertTrue(RegexScreener.isDateMMDDYYYYY("12/31/2023"));
    }

    @Test
    void validDateLeapDay() {
        Assertions.assertTrue(RegexScreener.isDateMMDDYYYYY("02/29/2024"));
    }

    @Test
    void invalidDateBlank() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY(""));
    }

    @Test
    void invalidDateNotDate() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("asdf"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("10/3s2/2024"));
    }

    @Test
    void invalidDateNoSeparators() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04232023"));
    }

    @Test
    void invalidDateNoLeadingZero() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("4/23/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("4/3/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04/3/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("4/03/2023"));
    }

    @Test
    void invalidDateShortDate() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("4/23/23"));
    }

    @Test
    void invalidDateMonth() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("00-23-2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("13-23-2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("133-23-2023"));
    }

    @Test
    void invalidDateDay() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04-00-2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04-32-2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04-362-2023"));
    }

    @Test
    void invalidDateYear() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04/23/0000"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04/23/123"));
    }

    @Test
    void invalidDateLastDay() {
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("01/32/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("02/29/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("02/30/2024"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("03/32/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("04/31/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("05/32/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("06/31/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("07/32/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("08/32/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("09/31/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("10/32/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("11/31/2023"));
        Assertions.assertFalse(RegexScreener.isDateMMDDYYYYY("12/32/2023"));
    }
}
