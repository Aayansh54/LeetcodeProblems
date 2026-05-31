int maximizeSum(int* nums, int numsSize, int k) {
    int max = 1;
    int i; 
    for( i = 0 ; i< numsSize ; i++){
        if(nums[i] > max )
        max = nums[i];

    }
    return max * k + ((k-1)*k/2);
}