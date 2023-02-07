// The Fibonacci sequence is defined by the recurrence relation:
// Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
// Hence the first 12 terms will be:
// F1 = 1
// F2 = 1
// F3 = 2
// F4 = 3
// F5 = 5
// F6 = 8
// F7 = 13
// F8 = 21
// F9 = 34
// F10 = 55
// F11 = 89
// F12 = 144
// The 12th term, F12, is the first term to contain three digits.
// What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
public class TwentyFifthQuestion
{
    public static void main(String[] args)
    {
        
        int a=1;
        int b=1;
        int n=2;
        System.out.println(a+"\n"+b);
        
        while(true)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            int count=countNumOFDigits(c);
            n++;
            if(count==4)
            {
                System.out.println("index that contain thousand digits are:-"+n);
                break;
            }
            else
            {
                continue;
            }
        }
        
    }   
    static int countNumOFDigits(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count=count+1;
        }
        return count;
    }
}
