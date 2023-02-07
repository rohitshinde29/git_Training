public class FortyFourQuestion {
    public static void main(String[] args) {
        int maxLength = 0;
        int startingNumber = 0;
        for (int i = 1; i < 1000000; i++) {
            int length = getCollatzLength(i);
            if (length > maxLength) {
                maxLength = length;
                startingNumber = i;
            }
        }
        System.out.println("Starting number: " + startingNumber);
        System.out.println("Length of sequence: " + maxLength);
    }

    private static int getCollatzLength(int n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }
        return length;
    }
}
