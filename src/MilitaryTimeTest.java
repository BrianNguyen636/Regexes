import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MilitaryTimeTest {
    @Test
    void validMilitaryTimeLessThan12Hours() {
        Assertions.assertTrue(RegexScreener.isMilitaryTime("0305"));
    }
    @Test
    void validMilitaryTimeMoreThan12Hours() {
        Assertions.assertTrue(RegexScreener.isMilitaryTime("1405"));
    }
    @Test
    void validMilitaryTime12Hours() {
        Assertions.assertTrue(RegexScreener.isMilitaryTime("1254"));
    }
    @Test
    void validMilitaryTimeZero() {
        Assertions.assertTrue(RegexScreener.isMilitaryTime("0000"));
    }
    @Test
    void validMilitaryTimeMax() {
        Assertions.assertTrue(RegexScreener.isMilitaryTime("2359"));
    }

    @Test
    void invalidMilitaryTimeBlank() {
        Assertions.assertFalse(RegexScreener.isMilitaryTime(""));
    }

    @Test
    void invalidMilitaryTimeTooLong() {
        Assertions.assertFalse(RegexScreener.isMilitaryTime("12545"));
    }
    @Test
    void invalidMilitaryTimeBadHours() {
        Assertions.assertFalse(RegexScreener.isMilitaryTime("2400"));
        Assertions.assertFalse(RegexScreener.isMilitaryTime("2530"));
    }

    @Test
    void invalidMilitaryTimeBadMinutes() {
        Assertions.assertFalse(RegexScreener.isMilitaryTime("2160"));
    }

    @Test
    void invalidMilitaryTimeHasColon() {
        Assertions.assertFalse(RegexScreener.isMilitaryTime("05:40"));
    }

    @Test
    void invalidMilitaryTimeNoLeadingZero() {
        Assertions.assertFalse(RegexScreener.isMilitaryTime("540"));
    }
}
