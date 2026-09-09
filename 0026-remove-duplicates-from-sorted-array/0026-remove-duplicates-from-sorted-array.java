class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 , j = 1, k = 1 , n = nums.length;
        while(i < n && j < n){
            int temp = nums[i];
            if(nums[j] == temp){
                j++;
            }
            else{
                nums[i + 1] = nums[j];
                k++;
                i++;
            }
        }
        return k;
    }
}