import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLTest {
    @Test
    void testValidWWW(){
        Assertions.assertEquals(true, Regex.isURL("www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("WWW.test.org"));
        Assertions.assertEquals(true, Regex.isURL("WwW.test.org"));
    }
    @Test
    void testValidPeriods(){
        Assertions.assertEquals(true, Regex.isURL("www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("www.test.info"));
    }
    @Test
    void testValidAllCaps(){
        Assertions.assertEquals(true, Regex.isURL("WWW.TEST.ORG"));
    }
    @Test
    void testValidSpottedCaps(){
        Assertions.assertEquals(true, Regex.isURL("WwW.TeSt.OrG"));
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
        Assertions.assertEquals(true, Regex.isURL("HTTP://test.org"));
        Assertions.assertEquals(true, Regex.isURL("HTTPS://test.org"));
    }
    @Test
    void testValidHTTP() {
        Assertions.assertEquals(true, Regex.isURL("http://www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("https://www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("HTTP://www.test.org"));
        Assertions.assertEquals(true, Regex.isURL("HTTPS://www.test.org"));
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
    void testRejectConsecutiveDotsDomain() {
        Assertions.assertEquals(false, Regex.isURL("www.test..123.org"));
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
