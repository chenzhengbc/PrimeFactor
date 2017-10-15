import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class PrimeTest {
    private final Logger log = LoggerFactory.getLogger(PrimeTest.class);

    @Test
    public void testIsPrime() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
    }

    @Test
    public void testIsNotPrime() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    public void testFindPossiblePrimeNumber_2() {
        LinkedList<Integer> list = Prime.findPossiblePrimeNumbers(2);
        log.info("Prime Numbers are:" + list.toString());
        assertEquals(1, list.size());
        assertTrue(list.contains(new Integer(2)));
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
    public void testFindPossiblePrimeNumber_10() {
        LinkedList<Integer> list = Prime.findPossiblePrimeNumbers(10);
        assertTrue(list.contains(new Integer(2)));
        assertTrue(list.contains(new Integer(3)));
        assertTrue(list.contains(new Integer(5)));
        assertTrue(list.contains(new Integer(7)));
    }

    @Test
    public void testFindPossiblePrimeNumber_300() {
        LinkedList<Integer> list = Prime.findPossiblePrimeNumbers(300);
        assertTrue(list.contains(new Integer(2)));
        assertTrue(list.contains(new Integer(3)));
        assertTrue(list.contains(new Integer(5)));
    }


    @Test
    public void test4GetPrimeFactor() {
        Queue<Integer> list = Prime.getPrimeFactor(4);
        assertNotNull(list);
        log.debug("PrimeFactor for 4 is " + list.toString());
    }

    @Test
    public void test6GetPrimeFactor() {
        Queue<Integer> list = Prime.getPrimeFactor(6);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        log.debug("PrimeFactor for 6 is " + list.toString());
    }


    @Test
    public void test300GetPrimeFactor() {
        Integer testNumber = 300;
        testFindPrimeFactors(testNumber);
    }

    private void testFindPrimeFactors(Integer testNumber) {
        Queue<Integer> list = Prime.getPrimeFactor(testNumber);
        assertNotNull(list);
        int result = 1;
        for (Integer i : list) {
            result = result * i;
        }
        assertEquals(testNumber.intValue(), result);
        log.debug("PrimeFactor for 6 is " + list.toString());
    }

    @Test
    public void test2GetPrimeFactor() {
        Integer testNumber = 2;
        testFindPrimeFactors(testNumber);
    }

}
