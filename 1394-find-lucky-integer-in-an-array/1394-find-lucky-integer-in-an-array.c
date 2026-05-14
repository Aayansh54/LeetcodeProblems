int findLucky(int* arr, int arrSize) {
    int* count = (int*)calloc(501,sizeof(int));
    int j,i;
    for(i = 0 ; i< arrSize ; i++){
        count[arr[i]]++;
    }
    for(j = 500 ; j >= 1 ; j-- ){
        if(count[j] == j) return j;
    }
    return -1;
}