import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int differenceNum = target - currentNum;
            if (map.containsKey(differenceNum)) {
                Integer index = map.get(differenceNum);
                if (index != i) {
                    return new int[]{i, index};
                }
            }
        }

        return answers;
    }
}
