// The sum of the squares of the first ten natural numbers is,
// 12 + 22 + ... + 102 = 385
// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class SixthQuestion
{
	public static void main(String[] args) {
	int n=100;
	int sum=(n*(n+1))/2;
	int sumsquare=sum*sum;
	int sum2=0;
	for(int i=1;i<=100;i++)
	{
	    sum2=sum2+(i*i);
	}
	System.out.println(sumsquare-sum2);
	}
}

