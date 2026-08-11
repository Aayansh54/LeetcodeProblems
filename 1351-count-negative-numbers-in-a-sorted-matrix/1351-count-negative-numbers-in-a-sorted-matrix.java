class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        int mid = 0;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = col - 1;
            while (left <= right) {
                mid = (left + right) / 2;
                if (grid[i][mid] >= 0) {
                    ans = mid;
                    left = mid + 1;
                } else
                    right = mid - 1;
            }
            if (right == -1) {
                count += col;
            }
            else
            count += col - ans - 1;
        }
        return count;
    }
}