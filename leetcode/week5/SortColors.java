public class SortColors {

    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
                continue;
            }
            if (num == 1) {
                one++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero > 0) {
                nums[i] = 0;
                zero--;
                continue;
            }
            if (one > 0) {
                nums[i] = 1;
                one--;
                continue;
            }
            nums[i] = 2;
        }
    }
}
