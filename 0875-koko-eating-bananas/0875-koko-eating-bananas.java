class Solution {
    public boolean caneat(int[] piles , int mid , int h){
        int hours = 0;
        for(int ban : piles){
            if(ban < mid){
                hours++;
            }
            else if( ban % mid == 0 ){
                hours += ban/mid;
            }
            else
                hours += ban/mid + 1;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxBan = 0;
        for(int x : piles){
            maxBan = Math.max(x,maxBan);
        }
        int left = 1 , right = maxBan;
        while(left < right){
            int mid = (left + right)/2;
            if(caneat(piles , mid,h)){
                right = mid;
            }
            else
            left = mid + 1;
        }
        return left;
    }
}