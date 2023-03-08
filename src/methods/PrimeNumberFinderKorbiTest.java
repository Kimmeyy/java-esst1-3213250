package methods;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberFinderKorbiTest {

    @org.junit.jupiter.api.Test
    void findPrimeNumbers() {

        var res = PrimeNumberFinderKorbi.findPrimeNumbers(10,20);
        assertEquals(4, res.size());
        assertEquals(11, res.get(0));
        assertEquals(13, res.get(1));
        assertEquals(17, res.get(2));
        assertEquals(19, res.get(3));
            }
}