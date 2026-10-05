class Solution {
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int sum = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            minSum = Math.min(minSum,sum);
        }
        return Math.abs(minSum) + 1; 
    }
}