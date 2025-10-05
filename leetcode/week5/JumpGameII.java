public class JumpGameII {

    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int jumpCount = 0;
        int currentPosition = 0;
        int maxPosition = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == currentPosition) {
                jumpCount++;
                currentPosition = maxPosition;
            }
        }

        return jumpCount;
    }
}
