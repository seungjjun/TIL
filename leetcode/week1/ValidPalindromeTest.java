import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void solve1() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        boolean answer = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");

        assertTrue(answer);
    }

    @Test
    void solve2() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        boolean answer = validPalindrome.isPalindrome("race a car");

        assertFalse(answer);
    }
}
