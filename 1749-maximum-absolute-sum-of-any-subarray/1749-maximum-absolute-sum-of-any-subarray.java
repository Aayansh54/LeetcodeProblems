class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int sum = 0;
        for(int x : nums){
            sum += x;
            maxSum = Math.max(sum,maxSum);
            minSum = Math.min(sum,minSum);
        }
        return maxSum - minSum;
    }
}