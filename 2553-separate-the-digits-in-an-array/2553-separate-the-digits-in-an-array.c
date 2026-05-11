/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* separateDigits(int* nums, int numsSize, int* returnSize) {
    int stack[6000] ;
    int top = -1;
    int i;
    int temp,digits;
    for(int j = numsSize-1 ; j >= 0 ; j--)
    {
        temp = nums[j];
        while(temp>0){
            digits = temp%10;
            stack[++top] = digits;
            temp /= 10;
        }
    }  
    *returnSize = top+1;
    int* ans = (int*)malloc(sizeof(int)* (*returnSize));
    for(i = 0  ; i < (*returnSize) ; i++){
        ans[i] = stack[top--];
    }
    return ans;
}