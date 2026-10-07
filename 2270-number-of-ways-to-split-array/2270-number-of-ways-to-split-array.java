class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long totSum = 0;
        for(int x : nums){
            totSum += x;
        }
        int count = 0;
        long ithSum = 0;
        for(int i = 0; i < n - 1 ; i++){
            ithSum += nums[i];
            if(ithSum >= (totSum - ithSum)){
                count++;
            }
        }
        return count;
    }
}