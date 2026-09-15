class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 2;
        int second = 2;
        int n = nums.length;
        while(second < n){
            if(nums[second] != nums[first -2 ]){
                nums[first++] = nums[second];
            }
            second++;
        }
        return first;
    }
}