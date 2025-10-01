public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int addedNumber = numbers[left] + numbers[right];
            if (addedNumber > target) {
                right--;
                continue;
            }

            if (addedNumber < target) {
                left++;
                continue;
            }

            return new int[]{left + 1, right + 1};
        }

        return new int[0];
    }
}
