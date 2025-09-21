public class ClimbingStairs {

    // 1 <= n <= 45
    private static final int[] memo = new int[46];

    public int climbStairs(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }

        if (n <= 2) {
            return n;
        }

        int stair = climbStairs(n - 1) + climbStairs(n - 2);
        memo[n] = stair;
        return stair;
    }
}
