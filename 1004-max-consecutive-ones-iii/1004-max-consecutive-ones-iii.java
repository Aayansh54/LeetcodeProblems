class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int left = 0;
        int right = 0;
        int max = 0;
        int zeroCount = 0;

        while (right < n) {

            if (nums[right] == 1) {
                right++;
                max = Math.max(max, right - left);
            }

            else if (nums[right] == 0 && zeroCount < k) {
                right++;
                zeroCount++;
                max = Math.max(max, right - left);
            }

            else if (nums[right] == 0 && zeroCount == k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
        }

        return max;
    }
}