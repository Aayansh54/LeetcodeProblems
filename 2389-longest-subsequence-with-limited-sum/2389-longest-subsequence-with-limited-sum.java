class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];

        

        long totSum = 0;
        for(int x : nums){
            totSum += x;
        }

        int j = 0;
        for(int q : queries){

            int maxLen = 0;
            
            long sum = totSum;
            
            int idx = n-1;
            
            while(sum > q){
                sum -= nums[idx--];

            }
            maxLen = Math.max(maxLen,idx+1);
            ans[j++] = maxLen;
        }
        return ans;
    }
}