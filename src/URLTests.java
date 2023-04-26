import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLTests {
    @Test
    void testValidWWW(){
        Assertions.assertEquals(true, Regex.isURL("www.test.org"));
    }
    @Test
    void testValidPeriods(){
        Assertions.assertEquals(true, Regex.isURL("www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("www.test.info"));
    }
    @Test
    void testValidAllowNumbers(){
        Assertions.assertEquals(true, Regex.isURL("www.test123.org"));
    }
    @Test
    void testValidAllowSpecialChars(){
        Assertions.assertEquals(true, Regex.isURL("www.test-!?.org"));
    }
    @Test
    void testValidWithoutWWW(){
        Assertions.assertEquals(true, Regex.isURL("test.org"));
    }
    @Test
    void testValidHTTPWithoutWWW(){
        Assertions.assertEquals(true, Regex.isURL("http://test.org"));
        Assertions.assertEquals(true, Regex.isURL("https://test.org"));

    }
    @Test
    void testValidHTTP() {
        Assertions.assertEquals(true, Regex.isURL("http://www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("https://www.test.org"));
    }
    @Test
    void testRejectNoPeriod(){
        Assertions.assertEquals(false, Regex.isURL("testorg"));
    }

    @Test
    void testRejectPeriodAtStartOrEnd(){
        Assertions.assertEquals(false, Regex.isURL(".testorg"));
        Assertions.assertEquals(false, Regex.isURL("testorg."));
        Assertions.assertEquals(false, Regex.isURL("test.org."));
    }
    @Test
    void testRejectCaps(){
        Assertions.assertEquals(false, Regex.isURL("HTTP://WWW.test.org"));
        Assertions.assertEquals(false, Regex.isURL("HTTPS://test.org"));
    }
    @Test
    void testRejectBlank(){
        Assertions.assertEquals(false, Regex.isURL(""));
    }
    @Test
    void testRejectSpaces(){
        Assertions.assertEquals(false, Regex.isURL("www.tes t.org"));
    }

}
