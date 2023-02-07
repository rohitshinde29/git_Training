public class ThirtyFourQuestion {
    public static void main(String[] args) {
        int sum=0;
        for(int i=3;i<Integer.MAX_VALUE;i++)
        {
            if(isSumEqualToFactorial(i))
            {
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
    static int Factorial(int n)
    {
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
    static boolean isSumEqualToFactorial(int n)
    {
        int factorial=0;
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int q=n%10;
            factorial=Factorial(q);
            sum=sum+factorial;
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}