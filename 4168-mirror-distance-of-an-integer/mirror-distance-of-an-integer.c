int mirrorDistance(int n) {
    if(n%10 == n) return 0;
    int reverse_n=0;
    int digit;
    int temp = n;
    while(temp>0){
        digit = temp% 10;
        reverse_n = reverse_n*10 + digit;
        temp/=10;    
    }
    if(n>reverse_n){
        return (n - reverse_n);
    }
    return (reverse_n - n);
}