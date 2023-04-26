import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddionTest {
    @Test
    void testValidOddLength(){
        Assertions.assertEquals(true, Regex.isOddion("fission"));
    }
    @Test
    void testValidIonEnd(){
        Assertions.assertEquals(true, Regex.isOddion("fission"));
        Assertions.assertEquals(true, Regex.isOddion("ion"));
    }
    @Test
    void testValidAllCaps() {
        Assertions.assertEquals(true, Regex.isOddion("FISSION"));
        Assertions.assertEquals(true, Regex.isOddion("ION"));
    }
    @Test
    void testValidSpottedCaps() {
        Assertions.assertEquals(true, Regex.isOddion("FiSSiOn"));
        Assertions.assertEquals(true, Regex.isOddion("IoN"));
    }
    @Test
    void testValidMultipleIon() {
        Assertions.assertEquals(true, Regex.isOddion("ionlionlion"));
        Assertions.assertEquals(true, Regex.isOddion("ionlion"));
    }
    @Test
    void testValidConsecutiveIon() {
        Assertions.assertEquals(true, Regex.isOddion("lionion"));
        Assertions.assertEquals(true, Regex.isOddion("ionionion"));
    }
    @Test
    void testRejectDigits(){
        Assertions.assertEquals(false, Regex.isOddion("1234ion"));
    }
    @Test
    void testRejectSpecialCharsExceptDash(){
        Assertions.assertEquals(false, Regex.isOddion("!Lion"));
        Assertions.assertEquals(false, Regex.isOddion("@Lion"));
        Assertions.assertEquals(false, Regex.isOddion("@Lion"));
        Assertions.assertEquals(false, Regex.isOddion("#Lion"));
        Assertions.assertEquals(false, Regex.isOddion("$Lion"));
        Assertions.assertEquals(false, Regex.isOddion("%Lion"));
        Assertions.assertEquals(false, Regex.isOddion("&^*()=_+Lion"));
    }
    @Test
    void testRejectSpaces(){
        Assertions.assertEquals(false, Regex.isOddion("l ion"));
        Assertions.assertEquals(false, Regex.isOddion("  ion"));
        Assertions.assertEquals(false, Regex.isOddion("fis ion"));
    }
    @Test
    void testRejectIonWrongOrder(){
        Assertions.assertEquals(false, Regex.isOddion("fissino"));
        Assertions.assertEquals(false, Regex.isOddion("fissnOi"));
    }
    @Test
    void testRejectEven(){
        Assertions.assertEquals(false, Regex.isOddion("Fusion"));
        Assertions.assertEquals(false, Regex.isOddion("Lion"));
    }
    @Test
    void testRejectNoIonEnd(){
        Assertions.assertEquals(false, Regex.isOddion("Odd"));
        Assertions.assertEquals(false, Regex.isOddion("Ionl"));
    }
}
