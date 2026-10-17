class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCnt = 0;
        int prodwithoutZero = 1;
        int product = 1;
        for(int x : nums){
            product *= x;
            if(x == 0){
                zeroCnt++;
            }else{
                prodwithoutZero *= x;
            }
        }
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                if(zeroCnt > 0){
                    ans[i] = 0;
                }else{
                    ans[i] = product / nums[i];
                }
            }else{
                if(zeroCnt > 1){
                    ans[i] = 0;
                }else{
                    ans[i] = prodwithoutZero;
                }
            }
        }
        return ans;
    }
}
