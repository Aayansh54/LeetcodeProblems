class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int leftProd[] = new int[n];
        int rightProd[] = new int[n];

        leftProd[0] = 1;
        for(int i = 0; i < n-1 ; i++){
            leftProd[i+1] = leftProd[i] * nums[i];
        }

        rightProd[n-1] = 1;
        for(int i = n -1 ; i >= 1 ; i--){
            rightProd[i-1] = rightProd[i] * nums[i];
        }

        for(int i = 0 ; i < n ; i++){
            ans[i] = leftProd[i] * rightProd[i];
        }
        return ans;
    }
}