package org.dsa;

public class LetCodeBiWeekly161 {
    public long splitArray(int[] nums) {
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrimeNumber(i)) sum1 += nums[i];
            else sum2 += nums[i];
        }
        return Math.abs(sum1 - sum2);
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LetCodeBiWeekly161 letCode = new LetCodeBiWeekly161();
        int[] nums = {175868717, 841457609, -948571070, -747264172};
        System.out.println(letCode.splitArray(nums));
    }


    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    int[] sum = new int[1]; // To hold island sum
                    dfs(grid, visited, i, j, sum);
                    if (sum[0] % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, boolean[][] visited, int i, int j, int[] sum) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || grid[i][j] <= 0) {
            return;
        }

        visited[i][j] = true;
        sum[0] += grid[i][j];

        dfs(grid, visited, i + 1, j, sum);
        dfs(grid, visited, i - 1, j, sum);
        dfs(grid, visited, i, j + 1, sum);
        dfs(grid, visited, i, j - 1, sum);
    }
}

