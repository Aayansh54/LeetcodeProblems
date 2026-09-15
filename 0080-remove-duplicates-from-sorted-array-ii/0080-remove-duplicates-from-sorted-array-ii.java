class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int n  = nums.length;
        while(i < n){
            int count = 0;
            int temp = nums[i];
            while(i < n && nums[i] == temp){
                i++;
                count++;
            }
            if(count>=2){
                nums[j++] = temp;
                nums[j++] = temp;
            }
            else{
                nums[j++] = temp;
            }
        }
        return j;
    }
}