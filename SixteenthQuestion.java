// 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// What is the sum of the digits of the number 21000?
import java.math.*;
public class SixteenthQuestion {
    public static void main(String[] args) {
        double l=Double.valueOf(String.valueOf((Math.pow(2l, 1000l))));
        BigDecimal d=new BigDecimal(l);
        String str=String.valueOf(d);
        System.out.println("2^1000 is "+str);
        double sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum=sum+ Double.valueOf(String.valueOf(str.charAt(i)));
                   }
        System.out.println("Sum is "+sum);
    }
    
}
