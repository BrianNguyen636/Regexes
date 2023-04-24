import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    void validNameMiddleInitial() {
        Assertions.assertTrue(Regex.isRosterName("Person, Joe, A"));
    }

    @Test
    void validNameNoMiddleInitial() {
        Assertions.assertTrue(Regex.isRosterName("Person, Joe"));
    }

    @Test
    void validNameMultipleMiddleInitials() {
        Assertions.assertTrue(Regex.isRosterName("Person, Joe, IS"));
    }

    @Test
    void validNameApostrophe() {
        Assertions.assertTrue(Regex.isRosterName("d'Arras, Mathais"));
    }

    @Test
    void validNameHyphenatedLastName() {
        Assertions.assertTrue(Regex.isRosterName("López-Alt, James, K"));
    }

    @Test
    void validNameJunior() {
        Assertions.assertTrue(Regex.isRosterName("King Jr., Martin, L"));
    }

    @Test
    void invalidNameBlank() {
        Assertions.assertFalse(Regex.isRosterName(""));
    }

    @Test
    void invalidNameTooLong() {
        Assertions.assertFalse(Regex.isRosterName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    void invalidNameNoCommas() {
        Assertions.assertFalse(Regex.isRosterName("Smith"));
    }

    @Test
    void invalidNameNoCommasWithSpace() {
        Assertions.assertFalse(Regex.isRosterName("Smith John L"));
        Assertions.assertFalse(Regex.isRosterName("Smith John"));
    }

    @Test
    void invalidNameHasSymbols() {
        Assertions.assertTrue(Regex.isRosterName("{d'Arras}, Mathais"));
    }
}
