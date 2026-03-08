public class EqualPairs {
    public int equalPairs(int[][] grid) {
        StringBuilder[] rows = new StringBuilder[grid.length];
        StringBuilder[] cols = new StringBuilder[grid.length];
        for (int i = 0; i < grid.length; i++) {
            rows[i] = new StringBuilder();
            cols[i] = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                rows[i].append(grid[i][j] + ", ");
                cols[i].append(grid[j][i] + ", ");
            }
        }
        int pairs = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid.length; j++)
                if (rows[i].equals(cols[j]))
                    pairs++;
        return pairs;
    }
}
