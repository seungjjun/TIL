import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenationTest {

    @Test
    void solve1() {
        Concatenation concatenation = new Concatenation();

        int[] answer = concatenation.getConcatenation(new int[]{1, 4, 1, 2});

        assertArrayEquals(new int[]{1, 4, 1, 2, 1, 4, 1, 2}, answer);
    }

    @Test
    void solve2() {
        Concatenation concatenation = new Concatenation();
        
        int[] answer = concatenation.getConcatenation(new int[]{1, 3, 2, 1});

        assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, answer);
    }

}
