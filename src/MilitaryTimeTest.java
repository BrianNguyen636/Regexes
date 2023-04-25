import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MilitaryTimeTest {
    @Test
    void validMilitaryTimeLessThan12Hours() {
        Assertions.assertEquals(true, Regex.isMilitaryTime("0305"));
    }
    @Test
    void validMilitaryTimeMoreThan12Hours() {
        Assertions.assertEquals(true, Regex.isMilitaryTime("1405"));
    }
    @Test
    void validMilitaryTime12Hours() {
        Assertions.assertEquals(true, Regex.isMilitaryTime("1254"));
    }
    @Test
    void validMilitaryTimeZero() {
        Assertions.assertEquals(true, Regex.isMilitaryTime("0000"));
    }
    @Test
    void validMilitaryTimeMax() {
        Assertions.assertEquals(true, Regex.isMilitaryTime("2359"));
    }

    @Test
    void invalidMilitaryTimeBlank() {
        Assertions.assertEquals(false, Regex.isMilitaryTime(""));
    }

    @Test
    void invalidMilitaryTimeTooLong() {
        Assertions.assertEquals(false, Regex.isMilitaryTime("12545"));
    }
    @Test
    void invalidMilitaryTimeBadHours() {
        Assertions.assertEquals(false, Regex.isMilitaryTime("2400"));
        Assertions.assertEquals(false, Regex.isMilitaryTime("2444"));
        Assertions.assertEquals(false, Regex.isMilitaryTime("2530"));
    }

    @Test
    void invalidMilitaryTimeBadMinutes() {
        Assertions.assertEquals(false, Regex.isMilitaryTime("2160"));
    }

    @Test
    void invalidMilitaryTimeHasColon() {
        Assertions.assertEquals(false, Regex.isMilitaryTime("05:40"));
    }

    @Test
    void invalidMilitaryTimeNoLeadingZero() {
        Assertions.assertEquals(false, Regex.isMilitaryTime("540"));
    }
}
