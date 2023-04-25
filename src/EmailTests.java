import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTests {

    @Test
    void validEmail() {
        Assertions.assertEquals(true, Regex.isEmail("guy@guy.com"));
    }

    @Test
    void validEmailHasDot() {
        Assertions.assertEquals(true, Regex.isEmail("guy.person@guy.com"));
    }

    @Test
    void validEmailHasCaps() {
        Assertions.assertEquals(true, Regex.isEmail("Guy@guy.com"));
    }

    @Test
    void validEmailHasNumbers() {
        Assertions.assertEquals(true, Regex.isEmail("Guy123@guy.com"));
    }

    @Test
    void validEmailHasSymbols() {
        Assertions.assertEquals(true, Regex.isEmail("Guy-Person-123@guy.com"));
        Assertions.assertEquals(true, Regex.isEmail("Guy_Person_123@guy.com"));
        Assertions.assertEquals(true, Regex.isEmail("Guy.Person+123@guy.com"));
    }

    @Test
    void validEmailSubdomain() {
        Assertions.assertEquals(true, Regex.isEmail("guy@guy.co.jp"));
    }

    @Test
    void invalidEmailBlank() {
        Assertions.assertEquals(false, Regex.isEmail(""));
    }

    @Test
    void invalidEmailNoAt() {
        Assertions.assertEquals(false, Regex.isEmail("guy.guy.com"));
    }

    @Test
    void invalidEmailNoLocal() {
        Assertions.assertEquals(false, Regex.isEmail("@guy.com"));
        Assertions.assertEquals(false, Regex.isEmail("guy.com"));
    }

    @Test
    void invalidEmailNoDomain() {
        Assertions.assertEquals(false, Regex.isEmail("guy@guy"));
        Assertions.assertEquals(false, Regex.isEmail("guy@guy."));
        Assertions.assertEquals(false, Regex.isEmail("guy@.com"));
    }

    @Test
    void invalidEmailMultipleAt() {
        Assertions.assertEquals(false, Regex.isEmail("guy@guy@guy.com"));
    }
}