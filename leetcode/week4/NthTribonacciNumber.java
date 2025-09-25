public class NthTribonacciNumber {
    private static final int[] memo = new int[38];

    public int tribonacci(int n) {
        memo[1] = 1;
        memo[2] = 1;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i - 3] + memo[i - 2] + memo[i - 1];
        }

        return memo[n];
    }
}
