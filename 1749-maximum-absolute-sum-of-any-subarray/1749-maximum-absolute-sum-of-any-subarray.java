class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int ans = 0;

        int sum1 = 0 ; int sum2 = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            sum1 += nums[i];
            sum2 += nums[i];

            maxSum = Math.max(maxSum , sum1);
            minSum = Math.min(minSum,sum2);
            if(sum1 < 0){
                sum1 = 0;
            }
            if(sum2 > 0){
                sum2 = 0;
            }
        }
        ans = Math.max(Math.abs(maxSum) , Math.abs(minSum));
        return ans;
    }
}