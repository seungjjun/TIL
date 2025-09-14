import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        int max = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            Integer value = map.get(num);
            if (max < value) {
                answer = num;
                max = value;
            }
        }

        return answer;
    }

}
