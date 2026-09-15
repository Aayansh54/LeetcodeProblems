class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;

        slow = nums[slow] ;
        fast = nums[nums[fast]];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int i = 0;
        while(i != slow)
        {
            i = nums[i];
            slow = nums[slow];
        }
        return i;
    }
}