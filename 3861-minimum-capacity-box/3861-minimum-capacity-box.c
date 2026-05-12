int minimumIndex(int* capacity, int capacitySize, int itemSize) {
    int min = INT_MAX;
    int i ,index;
    for(i = 0 ; i< capacitySize ; i++){
        if(capacity[i] >= itemSize && capacity[i] < min){
        min = capacity[i];
        index = i;}
    }
    if(min == INT_MAX ) return -1;
    return index;
}