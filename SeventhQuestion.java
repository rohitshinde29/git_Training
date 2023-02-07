// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class SeventhQuestion {
     public static void main(String[] args) {
    PrimeNumber primeNumber=new PrimeNumber();
    int n=primeNumber.nthprime(10001);        
    System.out.println(n);
    }    
}
class PrimeNumber
{
    public static boolean isPrime(int n)
    {
        int count=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  int nthprime(int nth)
    {
        int primecount=0;
        int num=2;
        while(primecount<nth)
        {
            if(isPrime(num))
            {
                primecount++;
            }
            num+=1;
        }
        return num-1;
    }

}
