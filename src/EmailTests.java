import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTests {

    @Test
    void testValidAllLetters() {
        Assertions.assertEquals(true, Regex.isEmail("abcdef@test.com"));
    }
    @Test
    void testValidAllDigits() {
        Assertions.assertEquals(true, Regex.isEmail("12345@123.123"));
    }
    @Test
    void testValidSpecialCharLocal() {
        Assertions.assertEquals(true, Regex.isEmail("!#%$^&*_+-=@test.com"));
    }
    @Test
    void testRejectMultipleAtSigns() {
        Assertions.assertEquals(false, Regex.isEmail("abcd@ef@test.com"));
    }
    @Test
    void testRejectPeriodAtLocalStartEnd() {
        Assertions.assertEquals(false, Regex.isEmail("abcdef.@test.com"));
        Assertions.assertEquals(false, Regex.isEmail(".abcdef@test.com"));
    }
//    @Test
//    void testRejectConsecutivePeriodsInDomain() {
//        Assertions.assertEquals(false, Regex.email("abc..def@test.com"));
//        Assertions.assertEquals(false, Regex.email("abc...def@test.com"));
//    }
}