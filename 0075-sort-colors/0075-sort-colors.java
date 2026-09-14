class Solution {
    public void sortColors(int[] nums) {
        int zerocount = 0;
        int twocount  =0 ;
        int onecount = 0;
        int n = nums.length;
        for(int x : nums){
            if(x == 0) zerocount++;
            else if(x == 2) twocount++;
            else onecount++;
        }
        int i = 0;
        int j = zerocount;
        int k = onecount + zerocount;
        while( i < j){
            nums[i++] = 0;
        }
        while( j < k){
            nums[j++] = 1;
        }
        while(k < n){
            nums[k++] = 2;
        }
    }
}