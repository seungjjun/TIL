import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    @Test
    void solve1() {
        BinarySearch binarySearch = new BinarySearch();

        int answer = binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 9);

        assertThat(answer).isEqualTo(4);
    }

    @Test
    void solve2() {
        BinarySearch binarySearch = new BinarySearch();

        int answer = binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 2);

        assertThat(answer).isEqualTo(-1);
    }

    @Test
    void solve3() {
        BinarySearch binarySearch = new BinarySearch();

        int answer = binarySearch.search(new int[] {5}, 5);

        assertThat(answer).isEqualTo(0);
    }
}
