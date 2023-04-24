//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//public class USCurrencyTest {
//    @Test
//    void validUSCurrencyExample() {
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$123,456,789.23"));
//    }
//
//    @Test
//    void validUSCurrencyNoCommas() {
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$123456789.23"));
//    }
//
//    @Test
//    void validUSCurrencyOnlyCents() {
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$0.23"));
//    }
//
//    @Test
//    void validUSCurrencyZero() {
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$0.00"));
//    }
//
//    @Test
//    void validUSCurrencyThousands() {
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$6,789.23"));
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$56,789.23"));
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$456,789.23"));
//    }
//
//    @Test
//    void validUSCurrencyMillions() {
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$3,456,789.23"));
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$23,456,789.23"));
//        Assertions.assertTrue(RegexScreener.isUSCurrency("$123,456,789.23"));
//    }
//
//    @Test
//    void invalidUSCurrencyBlank() {
//        Assertions.assertFalse(RegexScreener.isUSCurrency(""));
//    }
//
//    @Test
//    void invalidUSCurrencyWord() {
//        Assertions.assertFalse(RegexScreener.isUSCurrency("money"));
//    }
//
//    @Test
//    void invalidUSCurrencyNoDollarSign() {
//        Assertions.assertFalse(RegexScreener.isUSCurrency("6,789.23"));
//    }
//
//    @Test
//    void invalidUSCurrencyNoCents() {
//        Assertions.assertFalse(RegexScreener.isUSCurrency("$6,789."));
//        Assertions.assertFalse(RegexScreener.isUSCurrency("$6,789"));
//    }
//
//    @Test
//    void invalidUSCurrencyNegative() {
//        Assertions.assertFalse(RegexScreener.isUSCurrency("-$6,789.00"));
//    }
//}
