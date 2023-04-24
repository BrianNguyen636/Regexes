import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLTests {
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
    void testRejectNoPeriod(){
        Assertions.assertEquals(false, Regex.isURL("testorg"));
    }
    @Test
    void testRejectPeriodAtStartOrEnd(){
        Assertions.assertEquals(false, Regex.isURL(".testorg"));
        Assertions.assertEquals(false, Regex.isURL("testorg."));
        Assertions.assertEquals(false, Regex.isURL("test.org."));
    }


}
