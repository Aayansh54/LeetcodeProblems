class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0 , right = n - 1;
        int firstidx= -1,lastidx = -1;
        //finding first occurence
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                firstidx = mid;
                right = mid - 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else
                left = mid+1;
        }
        if(firstidx == -1){
            return new int[]{-1,-1};
        }

        //for last idx
        left = 0 ;
        right = n - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                lastidx=mid;
                left = mid +1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return new int[]{firstidx,lastidx};
    }
}