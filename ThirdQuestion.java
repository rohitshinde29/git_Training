// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
public class ThirdQuestion{
    public static void main(String[] args) {
        LargestPrimeFactor largestFactor=new LargestPrimeFactor();
        long lg=largestFactor.LargestPrimeFactor(600851475143L);
        System.out.println(lg);
    }
}
class LargestPrimeFactor
{
    public  long LargestPrimeFactor(long number) {
        long largestFactor = 1;
        for (long i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }
        if (number > 1) {
            largestFactor = number;
        }
        return largestFactor;
    }
}
