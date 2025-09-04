import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void solve1() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        boolean answer = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});

        assertTrue(answer);
    }

    @Test
    void solve2() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        boolean answer = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});

        assertFalse(answer);
    }

    @Test
    void solve3() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        boolean answer = containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});

        assertTrue(answer);
    }

}
