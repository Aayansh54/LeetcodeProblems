int findKthPositive(int* arr, int arrSize, int k) {
    int max = 0;
    for(int i = 0 ; i < arrSize ; i++){
        if(arr[i] > max)
        max = arr[i];
    }
    int* freq = (int*)calloc(max + 1,sizeof(int));
    for(int i = 0 ; i < arrSize ; i++){
        freq[arr[i]]++;
    }
    int counter = 0;
    for(int i = 1 ; i <=  max ; i++){
        if(freq[i] == 0)
        {
            counter++;
        }
        if(counter == k)
        return i;
    }
    return max + k - counter;
}