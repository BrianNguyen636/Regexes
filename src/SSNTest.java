import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SSNTest {

    @Test
    void testValidSSNAllDigits(){
        Assertions.assertEquals(false, Regex.isSSN("123bbcccc"));
    }
    @Test
    void testValidSSNNoSpaces(){
        Assertions.assertEquals(true, Regex.isSSN("123456789"));
    }
    @Test
    void testValidSSNDashes(){
        Assertions.assertEquals(true, Regex.isSSN("123-45-6789"));
    }
    @Test
    void testValidSSNSpaces(){
        Assertions.assertEquals(true, Regex.isSSN("123 45 6789"));
    }
    /**
     * May or may not change based on regex implementation
     */
    @Test
    void validSSNAllZero() {
        Assertions.assertEquals(true, Regex.isSSN("000000000"));
    }

    /**
     * May or may not change based on regex implementation
     */
    @Test
    void validSSNAllSame() {
        Assertions.assertEquals(true, Regex.isSSN("111111111"));
        Assertions.assertEquals(true, Regex.isSSN("222-22-2222"));
        Assertions.assertEquals(true, Regex.isSSN("333 33 3333"));
    }
    @Test
    void testRejectSSNOneSpaceOneDash() {
        Assertions.assertEquals(false, Regex.isSSN("123-45 6789"));
    }
    @Test
    void testRejectSSNOneSpace() {
        Assertions.assertEquals(false, Regex.isSSN("12345 6789"));
    }
    @Test
    void testRejectSSNOneDash() {
        Assertions.assertEquals(false, Regex.isSSN("123-456789"));
    }
    @Test
    void testRejectSSNBadSpace() {
        Assertions.assertEquals(false, Regex.isSSN("1 2345 6789"));
    }
    @Test
    void testRejectSSNBadDash() {
        Assertions.assertEquals(false, Regex.isSSN("1-2345-6789"));
    }
}
