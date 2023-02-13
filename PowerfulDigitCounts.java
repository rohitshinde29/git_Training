import java.math.BigInteger;

// The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.
// How many n-digit positive integers exist which are also an nth power?
public class PowerfulDigitCounts
{
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<3;i++)
        {
            calculatePower(i);
        }
    }
    static boolean calculatePower(int n)
    {
        int powerOfDigit=(int)Math.pow(n, n);
        int countDigits=countDigits(powerOfDigit);
        System.out.println( powerOfDigit+" "+countDigits);
        return true;
    }
    static int countDigits(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        // System.out.println(count);
        return count;
    }
}