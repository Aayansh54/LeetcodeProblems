class Solution {
    public int findMin(int[] nums) {
        int min = 5000;
        int n = nums.length;
        int left = 0 ;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[left] <= nums[mid]){
                if(nums[left] <= min ){
                    min = nums[left];
                }
                left = mid + 1;
            }
            else
            {
                if(nums[mid] <= min){
                    min = nums[mid];
                }
                right = mid - 1;
            }
        }
        return min;
    }
}