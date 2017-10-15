
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class PrimeTest {
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
        assertEquals(list.size(), 1);
        assertTrue(list.contains(new Integer(2)));
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
