class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return lessThan(nums,k)  - lessThan(nums,k-1);
    }
    int lessThan(int[]nums , int k){
        int n = nums.length;
        int l = 0, r = 0;
        int oddCount = 0;
        int count = 0;
        while(r < n){
            if(nums[r] % 2 != 0){
                oddCount++;
            }
            while(oddCount > k){
                if(nums[l] % 2 != 0){
                    oddCount--;
                }
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
}