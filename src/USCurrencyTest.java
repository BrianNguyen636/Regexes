import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class USCurrencyTest {
    @Test
    void validUSCurrencyExample() {
        Assertions.assertEquals(true, Regex.isUSCurrency("$123,456,789.23"));
    }

    @Test
    void validUSCurrencyNoCommas() {
        Assertions.assertEquals(true, Regex.isUSCurrency("$123456789.23"));
    }

    @Test
    void validUSCurrencyOnlyCents() {
        Assertions.assertEquals(true, Regex.isUSCurrency("$0.23"));
    }

    @Test
    void validUSCurrencyZero() {
        Assertions.assertEquals(true, Regex.isUSCurrency("$0.00"));
    }

    @Test
    void validUSCurrencyThousands() {
        Assertions.assertEquals(true, Regex.isUSCurrency("$6,789.23"));
        Assertions.assertEquals(true, Regex.isUSCurrency("$56,789.23"));
        Assertions.assertEquals(true, Regex.isUSCurrency("$456,789.23"));
    }

    @Test
    void validUSCurrencyMillions() {
        Assertions.assertEquals(true, Regex.isUSCurrency("$3,456,789.23"));
        Assertions.assertEquals(true, Regex.isUSCurrency("$23,456,789.23"));
        Assertions.assertEquals(true, Regex.isUSCurrency("$123,456,789.23"));
    }

    @Test
    void invalidUSCurrencyBlank() {
        Assertions.assertEquals(false, Regex.isUSCurrency(""));
    }

    @Test
    void invalidUSCurrencyWord() {
        Assertions.assertEquals(false, Regex.isUSCurrency("money"));
    }

    @Test
    void invalidUSCurrencyNoDollarSign() {
        Assertions.assertEquals(false, Regex.isUSCurrency("6,789.23"));
    }

    @Test
    void invalidUSCurrencyNoCents() {
        Assertions.assertEquals(false, Regex.isUSCurrency("$6,789."));
        Assertions.assertEquals(false, Regex.isUSCurrency("$6,789"));
    }

    @Test
    void invalidUSCurrencyNegative() {
        Assertions.assertEquals(false, Regex.isUSCurrency("-$6,789.00"));
    }
}
