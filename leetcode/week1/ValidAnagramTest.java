import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void solve1() {
        ValidAnagram validAnagram = new ValidAnagram();

        boolean answer = validAnagram.isAnagram("anagram", "nagaram");

        assertTrue(answer);
    }

    @Test
    void solve2() {
        ValidAnagram validAnagram = new ValidAnagram();

        boolean answer = validAnagram.isAnagram("rat", "car");

        assertFalse(answer);
    }

    @Test
    void solve3() {
        ValidAnagram validAnagram = new ValidAnagram();

        boolean answer = validAnagram.isAnagram("ab", "a");

        assertFalse(answer);
    }
}
