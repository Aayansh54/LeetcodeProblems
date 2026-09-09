class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int n =  nums.length;
    int i = 0 ; 
    int j = n - 1;
    while(i < j){
        if(nums[i] % 2 == 0){
            i++;
            continue;
        }    
        if(nums[j] % 2 != 0 ){
            j--;
            continue;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
    return nums;
}
}