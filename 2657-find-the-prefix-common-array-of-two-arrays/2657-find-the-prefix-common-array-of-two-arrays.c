/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findThePrefixCommonArray(int* A, int ASize, int* B, int BSize, int* returnSize) {
    int* ans = (int*) malloc(sizeof(int) * ASize);
    int* count = (int*) calloc(ASize +1 , sizeof(int));
    *returnSize = ASize;
    int i , prefix = 0; 
    for(i = 0 ; i < ASize ; i++){
        count[A[i]]++;
        if(count[A[i]] == 2)
        prefix++;
        count[B[i]]++;
        if(count[B[i]] == 2)
        prefix ++;
        ans[i] = prefix;
    }
    free(count);
    return ans;
}