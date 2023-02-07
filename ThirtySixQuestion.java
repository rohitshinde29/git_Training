public class ThirtySixQuestion {
    public static void main(String[] args) {
        // int decimal= 585;
        int sum=0;
        for(int decimal=0;decimal<1000000;decimal++)
        {
            if(isPallindromeInBoth(decimal))
            {
                sum=sum+decimal;
            }
        }
        System.out.println("Sum of Numbers are"+sum);
        // System.out.println(Integer.toBinaryString(decimal));
    }   
    static boolean isPallindromeInBoth(int n)
    {
        int temp=n;
        int rem=1;
        int num=0;
        while(n>0)
        {
            rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        if(temp==num)//first i checked whether my decimal is pallindrome then and only i gone for converting into binary and then checked whether my binary is pallindrome then i returned it to true and made the sum. 
        {
            String binary=Integer.toBinaryString(temp);
            String rev="";
            for(int i=binary.length()-1;i>=0;i--)
            {
                rev=rev+binary.charAt(i);
            }
            // System.out.println("Reverse"+rev);
            if(rev.equals(binary))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
