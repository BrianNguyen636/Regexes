import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    void validDateDashes() {
        Assertions.assertEquals(true, Regex.isDate("04-23-2023"));
    }

    @Test
    void validDateSlashes() {
        Assertions.assertEquals(true, Regex.isDate("04/23/2023"));
    }

    @Test
    void validDateJanuary1() {
        Assertions.assertEquals(true, Regex.isDate("01/01/2023"));
    }

    @Test
    void validDateDecember31() {
        Assertions.assertEquals(true, Regex.isDate("12/31/2023"));
    }

    @Test
    void validDateLeapDay() {
        Assertions.assertEquals(true, Regex.isDate("02/29/2024"));
    }

    @Test
    void invalidDateBlank() {
        Assertions.assertEquals(false, Regex.isDate(""));
    }

    @Test
    void invalidDateNotDate() {
        Assertions.assertEquals(false, Regex.isDate("asdf"));
        Assertions.assertEquals(false, Regex.isDate("10/3s2/2024"));
    }

    @Test
    void invalidDateNoSeparators() {
        Assertions.assertEquals(false, Regex.isDate("04232023"));
    }

    @Test
    void invalidDateNoLeadingZero() {
        Assertions.assertEquals(false, Regex.isDate("4/23/2023"));
        Assertions.assertEquals(false, Regex.isDate("4/3/2023"));
        Assertions.assertEquals(false, Regex.isDate("04/3/2023"));
        Assertions.assertEquals(false, Regex.isDate("4/03/2023"));
    }

    @Test
    void invalidDateShortDate() {
        Assertions.assertEquals(false, Regex.isDate("4/23/23"));
    }

    @Test
    void invalidDateMonth() {
        Assertions.assertEquals(false, Regex.isDate("00-23-2023"));
        Assertions.assertEquals(false, Regex.isDate("13-23-2023"));
        Assertions.assertEquals(false, Regex.isDate("133-23-2023"));
    }

    @Test
    void invalidDateDay() {
        Assertions.assertEquals(false, Regex.isDate("04-00-2023"));
        Assertions.assertEquals(false, Regex.isDate("04-32-2023"));
        Assertions.assertEquals(false, Regex.isDate("04-362-2023"));
    }

    @Test
    void invalidDateYear() {
        Assertions.assertEquals(false, Regex.isDate("04/23/0000"));
        Assertions.assertEquals(false, Regex.isDate("04/23/123"));
    }

    @Test
    void invalidDateLastDay() {
        Assertions.assertEquals(false, Regex.isDate("01/32/2023"));
        Assertions.assertEquals(false, Regex.isDate("02/29/2023"));
        Assertions.assertEquals(false, Regex.isDate("02/30/2024"));
        Assertions.assertEquals(false, Regex.isDate("03/32/2023"));
        Assertions.assertEquals(false, Regex.isDate("04/31/2023"));
        Assertions.assertEquals(false, Regex.isDate("05/32/2023"));
        Assertions.assertEquals(false, Regex.isDate("06/31/2023"));
        Assertions.assertEquals(false, Regex.isDate("07/32/2023"));
        Assertions.assertEquals(false, Regex.isDate("08/32/2023"));
        Assertions.assertEquals(false, Regex.isDate("09/31/2023"));
        Assertions.assertEquals(false, Regex.isDate("10/32/2023"));
        Assertions.assertEquals(false, Regex.isDate("11/31/2023"));
        Assertions.assertEquals(false, Regex.isDate("12/32/2023"));
    }
}
