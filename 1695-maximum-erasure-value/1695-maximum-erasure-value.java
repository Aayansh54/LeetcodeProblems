class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> unique = new HashSet<>();
        int n = nums.length;
        int l = 0;
        int r = 0;

        int sum = 0;
        int maxSum = 0;

        while (r < n) {
        
            sum += nums[r];

            if (unique.contains(nums[r])) {
          
                while (unique.contains(nums[r])) {
                    unique.remove(nums[l]);
                    sum -= nums[l];
                    l++;
                }
            }
            unique.add(nums[r]);
            maxSum = Math.max(maxSum, sum);

            r++;
        }
        return maxSum;
    }
}