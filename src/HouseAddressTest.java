//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class HouseAddressTest {
//
//    @Test
//    void validHouseAddressStreet() {
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce St."));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce St"));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Street"));
//    }
//
//    @Test
//    void validHouseAddressRoad() {
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Rd."));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Rd"));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Road"));
//    }
//
//    @Test
//    void validHouseAddressBoulevard() {
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Blvd."));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Blvd"));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Boulevard"));
//    }
//
//    @Test
//    void validHouseAddressAvenue() {
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Ave."));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Ave"));
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Avenue"));
//    }
//
//    @Test
//    void validHouseAddressWay() {
//        Assertions.assertTrue(RegexScreener.isHouseAddress("1900 Commerce Way"));
//    }
//
//    @Test
//    void validHouseAddressSpace() {
//        Assertions.assertTrue(RegexScreener.isHouseAddress("2400 S 240th St"));
//    }
//
//    @Test
//    void invalidHouseAddressBlank() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress(""));
//    }
//
//    @Test
//    void invalidHouseAddressNoNumber() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress("Commerce St."));
//    }
//
//    @Test
//    void invalidHouseAddressNoStreet() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress("1900 St."));
//    }
//
//    @Test
//    void invalidHouseAddressNoEnd() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress("1900 Commerce"));
//    }
//
//    @Test
//    void invalidHouseAddressOnlyNumber() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress("1900"));
//    }
//
//    @Test
//    void invalidHouseAddressOnlyStreet() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress("Commerce"));
//    }
//
//    @Test
//    void invalidHouseAddressOnlyEnd() {
//        Assertions.assertFalse(RegexScreener.isHouseAddress("St."));
//    }
//}
