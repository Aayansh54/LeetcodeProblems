class Solution {
    public boolean ispossible(int[] weights , int mid , int targetday){
        int day = 1,load  = 0;
        for(int weight : weights ){
             if(load + weight > mid){
                load = weight;
                day++;
            }
            else
            load += weight;
        }
        return day <= targetday;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sumofweights = 0;
        int max = 0;
        for(int x : weights){
            sumofweights += x;
            max = Math.max(x , max);
        }
        int left = max ; 
        int right = sumofweights;
        while(left < right){
            int mid = ( left + right ) / 2;
            if(ispossible(weights , mid , days)){
                right = mid;
            }
            else 
                left = mid + 1;
        }
        return left;
    }
}