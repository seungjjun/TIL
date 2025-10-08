public class MaxAreaOfIsland {
    
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    static boolean[][] visited;

    public int maxAreaOfIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int maxIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    int island = 0;
                    island = Math.max(maxIsland, dfs(i, j, grid, island));
                    maxIsland = Math.max(maxIsland, island);
                }
            }
        }

        return maxIsland;
    }

    private int dfs(int y, int x, int[][] grid, int island) {
        if (visited[y][x]) {
            return island;
        }

        visited[y][x] = true;
        island++;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextX < grid[0].length &&
                nextY >= 0 && nextY < grid.length &&
                grid[nextY][nextX] == 1
            ) {
                island = dfs(nextY, nextX, grid, island);
            }
        }

        return island;
    }
}
