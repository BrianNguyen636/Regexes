import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CityStateZipTest {

    @Test
    void validCityStateZip() {
        Assertions.assertEquals(true, Regex.isCityStateZip("Tacoma, WA 98402"));
    }

    @Test
    void validCityStateZipExtended() {
        Assertions.assertEquals(true, Regex.isCityStateZip("Tacoma, WA 98402-3100"));
    }

    @Test
    void validCityStateZipSpace() {
        Assertions.assertEquals(true, Regex.isCityStateZip("Des Moines, WA 98198"));
    }

    @Test
    void validCityStateZipHasDot() {
        Assertions.assertEquals(true, Regex.isCityStateZip("St. Augustine, FL 32084"));
    }

    @Test
    void validCityStateZipHasApostrophe() {
        Assertions.assertEquals(true, Regex.isCityStateZip("Coeur d'Alene, ID 83815"));
    }

    @Test
    void invalidCityStateZipBlank() {
        Assertions.assertEquals(false, Regex.isCityStateZip(""));
    }

    @Test
    void invalidCityStateZipOnlyCity() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma"));
    }

    @Test
    void invalidCityStateZipOnlyState() {
        Assertions.assertEquals(false, Regex.isCityStateZip("WA"));
    }

    @Test
    void invalidCityStateZipOnlyZip() {
        Assertions.assertEquals(false, Regex.isCityStateZip("98402"));
    }

    @Test
    void invalidCityStateZipNoCity() {
        Assertions.assertEquals(false, Regex.isCityStateZip(", WA 98402"));
        Assertions.assertEquals(false, Regex.isCityStateZip("WA 98402"));
    }

    @Test
    void invalidCityStateZipNoState() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, 98402"));
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma 98402"));
    }

    @Test
    void invalidCityStateZipNoZip() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, WA"));
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, WA "));
    }

    @Test
    void invalidCityStateZipNoComma() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma WA 98402"));
    }

    @Test
    void invalidCityStateZipBadState() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, W 98402"));
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, 84 98402"));
    }

    @Test
    void invalidCityStateZipBadZip() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, WA 98"));
    }
    @Test
    void invalidCityStateZipNotRealState() {
        Assertions.assertEquals(false, Regex.isCityStateZip("Tacoma, DQ 98042"));
    }
}
