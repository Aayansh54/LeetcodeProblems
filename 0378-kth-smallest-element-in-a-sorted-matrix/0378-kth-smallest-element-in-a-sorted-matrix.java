class Solution {
    public int countlessthan(int mid,int[][] matrix, int nor , int noc){
        int r = 0;
        int c = noc - 1;
        int count = 0;
        while(r < nor && c >= 0){
            if(matrix[r][c] <= mid){
                count+= c + 1;
                r++;
            }
            else 
            c--;
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int nor = matrix.length;
        int noc = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[nor - 1][noc - 1];
        int ans = 0;
        while(left <= right){
            int mid = ( left + right )/2;
            if(countlessthan(mid,matrix,nor, noc) < k){
                left = mid + 1;
            }
            else{
                ans = mid;
                right = mid-1; 
            }
        }
        return ans;
    }
}