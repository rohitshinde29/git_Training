// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20??
public class FifthQuestion {
    public static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
    
    public static long lcm(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = lcm(result, i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("LCM of numbers from 1 to 20: " + lcm(20));
    }
    
    
}
