import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {
    @Test
    void testValidLength(){
        Assertions.assertEquals(true, Regex.isPassword("aB!4567890"));
    }
    @Test
    void testValidOneUpperCase(){
        Assertions.assertEquals(true, Regex.isPassword("aB0!!!!!!!"));
    }
    @Test
    void testValidOneDigit(){
        Assertions.assertEquals(true, Regex.isPassword("aB!aBaBaB0"));
    }
    @Test
    void testValidOnePunctuation(){
        Assertions.assertEquals(true, Regex.isPassword("aB!4567890"));
        Assertions.assertEquals(true, Regex.isPassword(".aB4567890"));
        Assertions.assertEquals(true, Regex.isPassword("aB456,7890"));
        Assertions.assertEquals(true, Regex.isPassword("aB4567890?"));
    }
    @Test
    void testValidThreeLowerCase(){
        Assertions.assertEquals(true, Regex.isPassword("aB!aaa7890"));
    }
    @Test
    void testRejectLessThanTen(){
        Assertions.assertEquals(false, Regex.isPassword("aB!456789"));
    }
    @Test
    void testRejectNoUpperCase(){
        Assertions.assertEquals(false, Regex.isPassword("ab!4567890"));
    }
    @Test
    void testRejectNoDigit(){
        Assertions.assertEquals(false, Regex.isPassword("aB!cdDfgGijk"));
    }
    @Test
    void testRejectNoPunctuation(){
        Assertions.assertEquals(false, Regex.isPassword("aBCcdDfgGijk0"));
    }
    @Test
    void testRejectMoreConsecutiveLowerCase(){
        Assertions.assertEquals(false, Regex.isPassword("!abccDDfgGijk0"));
    }
}
