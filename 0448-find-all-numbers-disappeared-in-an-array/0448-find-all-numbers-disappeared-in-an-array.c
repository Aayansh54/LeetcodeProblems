/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int* freq_arr = (int*)calloc(numsSize + 1, sizeof(int));
    *returnSize = 0;
    int i,j= 0;
    for( i = 0 ; i < numsSize ; i++ ){
        freq_arr[nums[i]]++;
    }
    for(i = 1 ; i <= numsSize ; i++)
    {
        if(freq_arr[i] == 0)
        (*returnSize)++;
    }
    int* ans = (int*)malloc(sizeof(int)*(*returnSize));
    for(i = 1 ; i<=numsSize;i++){
        if(freq_arr[i] == 0)
        {
            ans[j++] = i;
        }
    }
    free(freq_arr);
    return ans;
}