
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class Prime {
    private final Logger log = LoggerFactory.getLogger(Prime.class);

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        boolean canBeDividedByOtherNumber = false;
        for (int i = number - 1; i > 1; i--) {
            if (i == 1) {
                break;
            }

            if (number % i == 0 ) {
                canBeDividedByOtherNumber = true;
                return !canBeDividedByOtherNumber;
            }
        }
        return !canBeDividedByOtherNumber;
    }


    public static Queue<Integer> getPrimeFactor(int number) {
        List<Integer> primesLessThanGivenNumber = findPossiblePrimeNumbers(number);
        return getPrimeFactor(number, primesLessThanGivenNumber);
    }
    private static Queue<Integer> getPrimeFactor (int number, List<Integer> primeList) {
        Queue<Integer> primeFactors = new PriorityQueue<Integer>();

        // looping through all the prime factors, try to divide as much as possible for a given prime
        for (Integer prime : primeList) {
            number = isPrimeFactorOf(number, prime, primeFactors);
        }

        if (number == 1) {
            return primeFactors;
        } else {
            return null;
        }
    }

    private static Integer isPrimeFactorOf(int number, int prime, Queue<Integer> primeFactorQueue) {
        if (primeFactorQueue == null) {
            throw new RuntimeException("Prime Factor Queue is empty");
        }
        if (number == 1) {
            return 1;
        } else if (number % prime == 0) {
            primeFactorQueue.add(prime);
            return isPrimeFactorOf(number / prime, prime, primeFactorQueue);
        } else {
            return number;
        }
    }


    public static LinkedList<Integer> findPossiblePrimeNumbers(int number) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = number - 1; i > 1; i--) {
            if (isPrime(i)) {
                linkedList.add(i);
            }
        }
        return linkedList;
    }
}
