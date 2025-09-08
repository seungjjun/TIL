public class BinarySearch {

    public int search(int[] nums, int target) {
        int answer = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
                continue;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        return answer;
    }
}
