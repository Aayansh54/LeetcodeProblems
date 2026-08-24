class Solution {
    public int nthUglyNumber(int n) {
        int i2 ,i3,i5;
        i2 = i3 = i5 = 1;
        int[] arr = new int[n+1];
        arr[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            int i2ugly = arr[i2] * 2;
            int i3ugly = arr[i3] * 3;
            int i5ugly = arr[i5] * 5;
            int minugly =  Math.min(i2ugly ,Math.min( i3ugly , i5ugly));
            arr[i] = minugly;
            if(minugly == i2ugly){
                i2++;
            }
             if(minugly == i3ugly){
                i3++;
            }
             if(minugly == i5ugly){
                i5++;
            }
        }
        return arr[n];
    }
}