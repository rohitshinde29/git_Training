import java.util.ArrayList;

public class ThirtySevenQuestion {

    static ArrayList<Integer> primes = new ArrayList<>();

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isTruncatablePrime(int n) {
        int num = n;
        int len = (int) Math.log10(num) + 1;
        for (int i = 1; i <= len; i++) {
            if (!isPrime(num)) return false;
        
            num %= (int) Math.pow(10, len - i);
        }
        num = n;
        for (int i = 1; i <= len; i++) {
            if (!isPrime(num)) return false;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 11; i < 1000000; i++) {
            if (isTruncatablePrime(i)) {
                count++;
                sum += i;
                primes.add(i);
            }
            if (count == 11) break;
        }
        System.out.println("Sum of truncatable primes: " + sum);
    }
}
