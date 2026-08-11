class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int right = rows * columns - 1;
        int left = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            int r = mid/columns;
            int c = mid % columns;
            if(matrix[r][c] == target) return true;
            if(matrix[r][c] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}