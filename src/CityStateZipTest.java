//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class CityStateZipTest {
//
//    @Test
//    void validCityStateZip() {
//        Assertions.assertTrue(RegexScreener.isCityStateZip("Tacoma, WA 98402"));
//    }
//
//    @Test
//    void validCityStateZipExtended() {
//        Assertions.assertTrue(RegexScreener.isCityStateZip("Tacoma, WA 98402-3100"));
//    }
//
//    @Test
//    void validCityStateZipSpace() {
//        Assertions.assertTrue(RegexScreener.isCityStateZip("Des Moines, WA 98198"));
//    }
//
//    @Test
//    void validCityStateZipHasDot() {
//        Assertions.assertTrue(RegexScreener.isCityStateZip("St. Augustine, FL 32084"));
//    }
//
//    @Test
//    void validCityStateZipHasApostrophe() {
//        Assertions.assertTrue(RegexScreener.isCityStateZip("Coeur d'Alene, ID 83815"));
//    }
//
//    @Test
//    void invalidCityStateZipBlank() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("")));
//    }
//
//    @Test
//    void invalidCityStateZipOnlyCity() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma")));
//    }
//
//    @Test
//    void invalidCityStateZipOnlyState() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("WA")));
//    }
//
//    @Test
//    void invalidCityStateZipOnlyZip() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("98402")));
//    }
//
//    @Test
//    void invalidCityStateZipNoCity() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip(", WA 98402")));
//        Assertions.assertFalse((RegexScreener.isCityStateZip("WA 98402")));
//    }
//
//    @Test
//    void invalidCityStateZipNoState() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, 98402")));
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma 98402")));
//    }
//
//    @Test
//    void invalidCityStateZipNoZip() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, WA")));
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, WA ")));
//    }
//
//    @Test
//    void invalidCityStateZipNoComma() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma WA 98402")));
//    }
//
//    @Test
//    void invalidCityStateZipBadState() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, W 98402")));
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, 84 98402")));
//    }
//
//    @Test
//    void invalidCityStateZipBadZip() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, WA 98")));
//    }
//
//    @Test
//    void invalidCityStateZipStateDoesntExist() {
//        Assertions.assertFalse((RegexScreener.isCityStateZip("Tacoma, GG 98402")));
//    }
//}
