public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] pay = new int[cost.length];

        pay[0] = cost[0];
        pay[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            pay[i] = Math.min(pay[i - 2] + cost[i], pay[i - 1] + cost[i]);
        }

        int lastStair = cost.length;
        return Math.min(pay[lastStair - 1], pay[lastStair - 2]);
    }
}
