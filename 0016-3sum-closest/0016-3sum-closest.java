class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        while (i < n - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target)
                    return sum;
                if (Math.abs(target - sum) < diff) {
                    diff = Math.abs(target - sum);
                    ans = sum;
                }
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
}