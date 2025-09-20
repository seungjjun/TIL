public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int pointer = m + n - 1;

        while (right >= 0) {
            if (left < 0) {
                nums1[pointer--] = nums2[right--];
                continue;
            }

            int numLeft = nums1[left];
            int numRight = nums2[right];

            if (numLeft > numRight) {
                nums1[pointer--] = numLeft;
                left--;
                continue;
            }

            nums1[pointer--] = numRight;
            right--;
        }
    }
}
