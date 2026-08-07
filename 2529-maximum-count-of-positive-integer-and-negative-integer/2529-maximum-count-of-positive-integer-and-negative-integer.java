import java.lang.Math;
class Solution {
    public int BinSearch(int[] nums , int target , int n){
        int left = 0, right = n - 1;
        int result = nums.length;
        while(left <= right){
           int  mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else
            {   
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int first_pos = BinSearch(nums,1,n);
        int first_zero = BinSearch(nums,0,n);
        return Math.max(n - first_pos , first_zero);
    }
}