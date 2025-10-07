public class NumberOfIslands {

    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    static boolean[][] visited;

    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    answer++;
                    dfs(i, j, grid);
                }
            }
        }
        return answer;
    }

    private void dfs(int y, int x, char[][] grid) {
        if (visited[y][x]) {
            return;
        }

        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextX < grid[0].length && nextY >= 0 && nextY < grid.length && grid[nextY][nextX] == '1') {
                dfs(nextY, nextX, grid);
            }
        }
    }
}
