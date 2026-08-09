class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int upperbound = n;
        int lowerbound = n;
        int left = 0 ;
        int right = n - 1;
        int[] ans = new int[2];
        //for lowerbound;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] >= target){
                lowerbound = mid;
                right = mid - 1;
            }
            else
                left = mid+1;
        }
        if(lowerbound == n || nums[lowerbound] != target){
            lowerbound = -1;
            upperbound = -1;
            ans[0] = lowerbound;
            ans[1] = upperbound;
            return ans;
        }

        //for upperbound
        left = 0 ;
        right = n - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] > target){
                upperbound = mid;
                right = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        ans[0] = lowerbound;
        ans[1] = upperbound - 1;
        return ans;
    }
}