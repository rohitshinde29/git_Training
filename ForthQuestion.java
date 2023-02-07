// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.
import java.util.ArrayList;
public class ForthQuestion
{
	public static void main(String[] args) {
		int product=0;
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		for(int i=100;i<1000;i++)
		{
		    for(int j=100;j<1000;j++)
		    {
		        product=i*j;
		    if(isPallindrome(product))
		        {
		            arraylist.add(product);
			   }
		    }
		}
		int maximum = arraylist.get(0);
        for (int i = 1; i < arraylist.size(); i++) {
            if (maximum < arraylist.get(i))
                maximum = arraylist.get(i);
        }
		System.out.println(maximum);
	}
	public static boolean isPallindrome(int n)
	{
	    int temp=n;
	    int duplicate=0;
	    while(n>0)
	    {
            int r=n%10;
            duplicate=(duplicate*10)+r;
            n=n/10;
	    }
	    if(temp==duplicate)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
}
// Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.
// A Collection represents a single unit of objects, i.e., a group.