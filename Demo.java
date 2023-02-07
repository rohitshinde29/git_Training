public class Demo {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=9;i++)
        {
            if(i%2==1)
            {
                if(isPallindromeInBoth(i))
                {
                    sum=sum+i;
                    System.out.println(sum);

                }
            }
        }
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=9;j++)
            {
                int num=(j*((int)Math.pow(10,i)))+j;
                System.out.println(num);
                if(isPallindromeInBoth(num))
                {
                    sum=sum+num;
                }
            }
        }
    }
    static boolean isPallindromeInBoth(int n)
    {
        String binary=Integer.toBinaryString(n);
        // System.out.println(binary);
        String rev="";
        for(int i=binary.length()-1;i>=0;i--)
        {
            rev=rev+binary.charAt(i);
        }
        if(rev.equals(binary))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
