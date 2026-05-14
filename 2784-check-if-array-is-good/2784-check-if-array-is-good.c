bool isGood(int* nums, int numsSize) {
    int n = numsSize - 1,i;
    int* ans = (int*)calloc(numsSize+1,sizeof(int));
    for( i = 0 ; i < numsSize ;i++){
        if(nums[i] < 1 || nums[i] > n){
            free(ans);
            return false;
        }
        ans[nums[i]]++;
    }
    for(i = 1 ; i < n ; i++){
        if(ans[i] != 1) 
        {
            free(ans);
            return false;
        }
    }
    if(ans[n]!= 2) 
    {
        free(ans);
        return false;
    }
    free(ans);
    return true;
}