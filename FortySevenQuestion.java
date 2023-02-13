import java.util.*;

public class FortySevenQuestion {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (count < 4) {
            if (numberOfDistinctPrimeFactors(i) == 4) {
                count++;
            } else {
                count = 0;
            }
            i++;
        }
        int first = i - 4;
        System.out.println("The first number is: " + first);
    }

    public static int numberOfDistinctPrimeFactors(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            primeFactors.add(n);
        }
        return primeFactors.size();
    }
}