public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int answer = 0;
        while (left < right) {
            int x = right - left;
            int y = Math.min(height[left], height[right]);

            answer = Math.max(answer, x * y);

            if (height[left] > height[right]) {
                right--;
                continue;
            }
            if (height[left] <= height[right]) {
                left++;
            }
        }

        return answer;
    }
}
