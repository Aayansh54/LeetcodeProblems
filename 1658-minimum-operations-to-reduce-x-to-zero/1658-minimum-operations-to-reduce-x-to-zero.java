class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        
        int target = sum - x;

        if(target < 0) return -1;
        int l = 0, r = 0;


        int max = -1;
        int subsum = 0;

        while(r < n){
            subsum += nums[r];
            while(subsum > target){
                subsum -= nums[l];
                l++;
            }
            if(subsum == target){
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max == -1 ? -1: n-max;
    }
}