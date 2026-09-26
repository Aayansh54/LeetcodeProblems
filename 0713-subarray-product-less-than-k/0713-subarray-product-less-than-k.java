class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int product = 1;
        int l = 0;
        int r = 0;
        int count = 0;
        if(k <= 1) return 0;
        while(r < n){
            product *= nums[r];
            
            while(product >= k){
                product /= nums[l];
                l++;
            }

            if(product < k){
                count += r - l + 1;
            }
            r++;
        }
        return count;
    }
}