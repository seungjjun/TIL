import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();

            if (x != y) {
                queue.add(y - x);
            }
        }

        if (queue.isEmpty()) {
            return 0;
        }

        return queue.poll();
    }
}
