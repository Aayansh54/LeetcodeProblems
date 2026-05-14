int maxProduct(int* nums, int numsSize) {
    int largest = 0 , second_largest = 0, i ;
    for(i = 0 ; i < numsSize ; i++ ){
        if(nums[i] > largest){
            second_largest = largest;
            largest = nums[i];
        }
        else if(nums[i] > second_largest )//did not write nums[i]!=largest because here second largest can be largest
        second_largest = nums[i];
    }
    return (largest - 1) * (second_largest -1);
}