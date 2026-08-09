class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int right = n -1 ;
        int left = 0 ;
        if(n == 1) return nums[0];
        int rightdis = 0;
        while(left <= right){
            int mid = left + ( right - left)/2;

            if(mid == 0 && nums[0] != nums[1]) return nums[0];
            if(mid == n - 1 && nums[n-1] != nums[n-2] ) return nums[mid];

            if(nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]){
                return nums[mid];
            }

            else if(nums[mid - 1] == nums[mid]){
                 rightdis = n - mid - 1;
                 if(rightdis % 2 == 0)
                    right = mid - 1;
                else
                    left = mid + 1;
            }

            else if(nums[mid + 1] == nums[mid]){
                rightdis = n - mid;

                if(rightdis % 2 == 0){
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}