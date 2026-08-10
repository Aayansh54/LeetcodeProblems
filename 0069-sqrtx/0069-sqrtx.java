class Solution {
    public int mySqrt(int x) {
        if( x == 0) return 0;
        int left = 1;
        int right = x;
        int ans = 0 ;
        long result = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            result = (long)mid * mid;
            if(result == x){
                return mid;
            }
            else if(result < x){
                left = mid + 1;
                ans = mid;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}