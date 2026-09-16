class Solution {
    public int minSwaps(int[] nums) {
        int oneCount=0;
        int n = nums.length;
        for(int x : nums){
            if(x == 1){
                oneCount++;
            }
        }
        int k = oneCount;
        int zeroCount = 0;
        for(int i = 0 ; i< k ; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
        }
        int minZero = zeroCount;
        int left = 0;
        int right = k - 1;
        while(left<n){
            if(nums[++right % n] == 0){
                zeroCount++;
            }
            if(nums[left++ ] == 0){
                zeroCount--;
            }
            minZero = Math.min(minZero , zeroCount);
        }
        return minZero;
    }
}