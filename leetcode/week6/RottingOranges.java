import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        int count = 0;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == 2) {
                    queue.offer(new int[]{y, x});
                }
            }
        }

        while (!queue.isEmpty()) {
            bfs(queue, grid, queue.size());
            if (!queue.isEmpty()) {
                count += 1;
            }
        }

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == 1) {
                    return -1;
                }
            }
        }

        return count;
    }

    private void bfs(Queue<int[]> queue, int[][] grid, int size) {
        for (int i = 0; i < size; i++) {
            int[] poll = queue.poll();

            for (int j = 0; j < 4; j++) {
                int nextY = poll[0] + dy[j];
                int nextX = poll[1] + dx[j];

                if (nextX >= 0 && nextX < grid[0].length &&
                    nextY >= 0 && nextY < grid.length &&
                    grid[nextY][nextX] == 1
                ) {
                    grid[nextY][nextX] = 2;
                    queue.offer(new int[]{nextY, nextX});
                }
            }
        }
    }

}
