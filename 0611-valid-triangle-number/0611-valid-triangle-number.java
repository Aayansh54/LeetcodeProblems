class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int triplets = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;
            if (nums[k] == 0)
                continue;
            while (i < j) {
                if (nums[i] == 0) {
                    i++;
                    continue;
                }
                if (nums[j] == 0) {
                    j--;
                    continue;
                }
                if (nums[i] + nums[j] > nums[k]) {
                    triplets += j - i;
                    j--;
                } else
                    i++;
            }

        }
        return triplets;
    }
}