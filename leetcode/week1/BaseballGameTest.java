import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    @Test
    void solve1() {
        BaseballGame baseballGame = new BaseballGame();

        int answer = baseballGame.calPoints(new String[] {"5", "2", "C", "D", "+"});

        assertEquals(30, answer);
    }

    @Test
    void solve2() {
        BaseballGame baseballGame = new BaseballGame();

        int answer = baseballGame.calPoints(new String[] {"5","-2","4","C","D","9","+","+"});

        assertEquals(27, answer);
    }

    @Test
    void solve3() {
        BaseballGame baseballGame = new BaseballGame();

        int answer = baseballGame.calPoints(new String[] {"1","C"});

        assertEquals(0, answer);
    }
}
