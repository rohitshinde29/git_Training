public class TwentyThreeQuestion{

    public static void main(String[] args) {
        System.out.println(solve());
    }
    public static int solve() {
    int limit = 28123;
    boolean[] isAbundant = new boolean[limit + 1];
    for (int i = 12; i <= limit; i++) {
        if (sumOfProperDivisors(i) > i) {
            isAbundant[i] = true;
        }
    }
    
    boolean[] canBeWrittenAsSum = new boolean[limit + 1];
    for (int i = 12; i <= limit; i++) {
        if (!isAbundant[i]) {
            continue;
        }
        for (int j = i; j <= limit; j++) {
            if (!isAbundant[j]) {
                continue;
            }
            int sum = i + j;
            if (sum > limit) {
                break;
            }
            canBeWrittenAsSum[sum] = true;
        }
    }
    
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
        if (!canBeWrittenAsSum[i]) {
            sum += i;
        }
    }
    
    return sum;
}

private static int sumOfProperDivisors(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    return sum;
}
}