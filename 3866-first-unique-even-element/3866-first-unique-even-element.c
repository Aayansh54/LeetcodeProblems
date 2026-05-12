#include<stdlib.h>
int firstUniqueEven(int* nums, int numsSize) {
    int* count = (int*)calloc(101, sizeof(int));
    for(int i = 0 ; i< numsSize ; i++){
        count[nums[i]]++;
    }
    for(int i = 0 ; i < numsSize ; i++){
        if(nums[i] % 2 == 0 && count[nums[i]] == 1)
        {
            free(count);
            return nums[i];
        }
        }
    free(count);
    return -1;

}