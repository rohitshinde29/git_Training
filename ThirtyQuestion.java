import java.math.BigInteger;

import javax.swing.plaf.synth.SynthMenuItemUI;

public class ThirtyQuestion {
    public static void main(String[] args) {;
        int sum=0;
        for(int i=2;i<1000000;i++)
        {

            if(isSumOfFifthPower(i))
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    static boolean isSumOfFifthPower(int i)
    {
        int temp=i;
        int sum=0;
        while(temp>0)
        {

            int rem=temp%10;
            sum=sum+(int)Math.pow(rem, 5);
            temp=temp/10;
        }
        if(sum==i)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
