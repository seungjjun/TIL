import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void solve1() {
        TwoSum t = new TwoSum();

        int[] answers = t.twoSum(new int[] {2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0, 1}, answers);
    }

    @Test
    void solve2() {
        TwoSum t = new TwoSum();

        int[] answers = t.twoSum(new int[] {3, 2, 4}, 6);

        assertArrayEquals(new int[]{1, 2}, answers);
    }

    @Test
    void solve3() {
        TwoSum t = new TwoSum();

        int[] answers = t.twoSum(new int[] {3, 3}, 6);

        assertArrayEquals(new int[]{0, 1}, answers);
    }

}
