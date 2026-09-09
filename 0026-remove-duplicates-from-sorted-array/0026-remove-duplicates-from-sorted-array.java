class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 , j = 1 , n = nums.length;
        while(i < n && j < n){
            if(nums[j] == nums[i]){
                j++;
            }
            else{
                nums[++i] = nums[j++];
            }
        }
        return i+1;
    }
}