/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    int cnt = 0;
    int* ans = (int*)malloc(sizeof(int) * (*returnSize));
    for(int i = 0 ; i< numsSize ; i++){
        cnt = 0;
        for(int j = 0 ; j<numsSize ;j++){
            if(nums[i]>nums[j])
            cnt++;
        }
        ans[i] = cnt;
    }
    return ans;
}