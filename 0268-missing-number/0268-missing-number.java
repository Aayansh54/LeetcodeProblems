class Solution {
    public int missingNumber(int[] nums) {
     int n = nums.length;
     int sum = (n * (n+1))/2;
     int actsum = 0;
     for(int x : nums){
        actsum += x;
     }  
     return sum - actsum;
    }
}