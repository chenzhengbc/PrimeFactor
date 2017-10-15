import java.util.LinkedList;


public class Prime {

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

    // prime factor means the number can be made up of 300
    public static boolean isPrimeFactor (int number) {
        // find all the prime numbers below the number provided
        // try to divide the number by the prime number below
        // if the number can be divided, follow the same process
        return false;
    }

    public static void findPrimeFactor(int number) {

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
