int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int cnt = 0 , max = 0;
    for(int i = 0 ; i < numsSize ; i++ ){
        if(nums[i] == 1 )
        {
            cnt++;
        }
        else if(nums[i] == 0)
        {
            if(cnt>max)
            max = cnt;
            cnt = 0;
        }
        if(cnt>max)
        max = cnt;
    }
    return max;
}