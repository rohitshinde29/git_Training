// n! means n × (n − 1) × ... × 3 × 2 × 1
// For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
// and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
// Find the sum of the digits in the number 100!
import java.math.BigDecimal;
import java.math.BigInteger;
public class TwentythQuestion {
    public static void main(String[] args) {
        
        double bigInteger=FactDigitSum(100);
        System.out.println(bigInteger);
    }
    static double FactDigitSum(int number)
    {
        BigInteger product = BigInteger.ONE;
        for (int  x = number;x>0;x--)
        {
            product = product.multiply(BigInteger.valueOf(x));
        }
        System.out.println("factorial of 100 is \n"+product);
        String str=String.valueOf(product);
        double sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum=sum+Double.valueOf(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
}