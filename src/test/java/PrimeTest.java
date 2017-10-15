
import org.junit.Test;

import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class PrimeTest {
    private final Logger log = LoggerFactory.getLogger(PrimeTest.class);
    @Test
    public void testIsPrime(){
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
    }

    @Test
    public void testIsNotPrime(){
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    public void testFindPossiblePrimeNumber_4() {
        LinkedList<Integer> list = Prime.findPossiblePrimeNumbers(4);
        log.info("Prime Numbers are:" + list.toString());
        assertEquals(2, list.size());
        assertTrue(list.contains(new Integer(2)));
        assertTrue(list.contains(new Integer(3)));
    }


    @Test
    public void test4IsPrimeFactor(){
        assertTrue(Prime.isPrimeFactor(4));
    }


    @Test
    public void test300IsPrimeFactor(){
        assertTrue(Prime.isPrimeFactor(300));
    }

}
