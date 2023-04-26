import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneNumTest {
    @Test
    void testValidLength() {
        Assertions.assertEquals(true, Regex.isPhoneNumber("1234567890"));
    }
    @Test
    void testValidParenthesis() {
        Assertions.assertEquals(true, Regex.isPhoneNumber("(123)4567890"));
        Assertions.assertEquals(true, Regex.isPhoneNumber("(123)456-7890"));
    }
    @Test
    void testValidDashes() {
        Assertions.assertEquals(true, Regex.isPhoneNumber("123-456-7890"));
        Assertions.assertEquals(true, Regex.isPhoneNumber("123456-7890"));
        Assertions.assertEquals(true, Regex.isPhoneNumber("123-4567890"));
    }
    @Test
    void testRejectNotAllDigits(){
        Assertions.assertEquals(false, Regex.isPhoneNumber("abcdefghij"));
        Assertions.assertEquals(false, Regex.isPhoneNumber("(111)defghij"));
    }
    @Test
    void testRejectOneParenthesis(){
        Assertions.assertEquals(false, Regex.isPhoneNumber("(1234567890"));
        Assertions.assertEquals(false, Regex.isPhoneNumber("123)4567890"));
    }
    @Test
    void testRejectWrongLength(){
        Assertions.assertEquals(false, Regex.isPhoneNumber("01234567890"));
    }
    @Test
    void testRejectBadParenthesis(){
        Assertions.assertEquals(false, Regex.isPhoneNumber("(1234)567890"));
    }
    @Test
    void testRejectBadDash(){
        Assertions.assertEquals(false, Regex.isPhoneNumber("(12345678-90"));
    }
    @Test
    void testRejectOnlyDashes(){
        Assertions.assertEquals(false, Regex.isPhoneNumber("(----------"));
    }


}
