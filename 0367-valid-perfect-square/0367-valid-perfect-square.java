class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while(left <= right){
            int mid = left + (right - left)/2;
            long res = (long)mid * mid;
            if(res == num) return true;
            if(res > num){
                right = mid - 1;
            }
            else 
                left = mid + 1;
        }
        return false;
    }
}