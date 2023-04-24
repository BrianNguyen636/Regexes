import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    void validNameMiddleInitial() {
        Assertions.assertEquals(true, Regex.isRosterName("Person, Joe, A"));
    }

    @Test
    void validNameNoMiddleInitial() {
        Assertions.assertEquals(true, Regex.isRosterName("Person, Joe"));
    }

    @Test
    void validNameMultipleMiddleInitials() {
        Assertions.assertEquals(true, Regex.isRosterName("Person, Joe, IS"));
    }

    @Test
    void validNameApostrophe() {
        Assertions.assertEquals(true, Regex.isRosterName("d'Arras, Mathais"));
    }

    @Test
    void validNameHyphenatedLastName() {
        Assertions.assertEquals(true, Regex.isRosterName("Lopez-Alt, James, K"));
    }

    @Test
    void validNameJunior() {
        Assertions.assertEquals(true, Regex.isRosterName("King Jr., Martin, L"));
    }

    @Test
    void invalidNameBlank() {
        Assertions.assertEquals(false, Regex.isRosterName(""));
    }

    @Test
    void invalidNameExcessCommas() {
        Assertions.assertEquals(false, Regex.isRosterName("Person, Joe, Higashi, IS"));
    }

    @Test
    void invalidNameNoCommas() {
        Assertions.assertEquals(false, Regex.isRosterName("Smith"));
    }

    @Test
    void invalidNameNoCommasWithSpace() {
        Assertions.assertEquals(false, Regex.isRosterName("Smith John L"));
        Assertions.assertEquals(false, Regex.isRosterName("Smith John"));
    }

    @Test
    void invalidNameHasSymbols() {
        Assertions.assertEquals(false, Regex.isRosterName("{d'Arras}, Mathais"));
    }
}
