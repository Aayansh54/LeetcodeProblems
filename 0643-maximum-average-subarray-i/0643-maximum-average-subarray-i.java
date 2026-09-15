class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = k - 1;
        double sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        double max = sum;
        while(right < n - 1 ){
            sum -= nums[left++];
            sum += nums[++right];
            max = Math.max(max , sum);
        }
        return max/k ;
    }
        
}