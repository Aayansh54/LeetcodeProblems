class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        int high = n - 1;
        int low = 0;
        int mid;
        int ans = n;

        while(high >= low){
            mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
                ans = mid;
            }
            else
                low = mid + 1;
        }
    return ans;
    }
};