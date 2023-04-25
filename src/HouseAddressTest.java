import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseAddressTest {

    @Test
    void validHouseAddressStreet() {
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce St."));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce St"));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Street"));
    }

    @Test
    void validHouseAddressRoad() {
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Rd."));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Rd"));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Road"));
    }

    @Test
    void validHouseAddressBoulevard() {
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Blvd."));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Blvd"));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Boulevard"));
    }

    @Test
    void validHouseAddressAvenue() {
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Ave."));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Ave"));
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Avenue"));
    }

    @Test
    void validHouseAddressWay() {
        Assertions.assertEquals(true, Regex.isAddress("1900 Commerce Way"));
    }

    @Test
    void validHouseAddressSpace() {
        Assertions.assertEquals(true, Regex.isAddress("2400 S 240th St"));
    }

    @Test
    void invalidHouseAddressBlank() {
        Assertions.assertEquals(false, Regex.isAddress(""));
    }

    @Test
    void invalidHouseAddressNoNumber() {
        Assertions.assertEquals(false, Regex.isAddress("Commerce St."));
    }

    @Test
    void invalidHouseAddressNoStreet() {
        Assertions.assertEquals(false, Regex.isAddress("1900 St."));
    }

    @Test
    void invalidHouseAddressNoEnd() {
        Assertions.assertEquals(false, Regex.isAddress("1900 Commerce"));
    }

    @Test
    void invalidHouseAddressOnlyNumber() {
        Assertions.assertEquals(false, Regex.isAddress("1900"));
    }

    @Test
    void invalidHouseAddressOnlyStreet() {
        Assertions.assertEquals(false, Regex.isAddress("Commerce"));
    }

    @Test
    void invalidHouseAddressOnlyEnd() {
        Assertions.assertEquals(false, Regex.isAddress("St."));
    }
}
