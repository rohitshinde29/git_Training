// "An irrational decimal fraction is created by concatenating the positive integers:
// 0.123456789101112131415161718192021...
// It can be seen that the 12th digit of the fractional part is 1.
// If dn represents the nth digit of the fractional part, find the value of the following expression.
// d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000"
public class FortyQuestion {
    public static int getNthDigit(int n) {
      int len = 1;
      int count = 9;
      int start = 1;
    
      while (n > len * count) {
        n -= len * count;
        len += 1;
        count *= 10;
        start *= 10;
      }
    
      start += (n - 1) / len;
      String s = Integer.toString(start);
      return Character.getNumericValue(s.charAt((n - 1) % len));
    }
    
    public static void main(String[] args) {
      int[] arr = {1, 10, 100, 1000, 10000, 100000, 1000000};
      int result = 1;
    
      for (int i = 0; i < arr.length; i++) {
        result *= getNthDigit(arr[i]);
      }
    
      System.out.println("Result: " + result);
    }
  }
  