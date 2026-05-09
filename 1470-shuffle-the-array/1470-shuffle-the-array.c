

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    *returnSize = numsSize;
    int* ans = (int*)malloc(sizeof(int) * (*returnSize));
    ans[0] = nums[0];
    int i = 1,j = n,k=1;
    while(i<numsSize){
        if(i%2 != 0 ){
            ans[i] = nums[j];
            j++;
        }
        else
        {
            ans[i] = nums[k];
            k++;
        }
        i++;
    }
    return ans;
}