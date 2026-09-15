class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int totalsum = 0;
        for(int x : cardPoints){
            totalsum += x;
        }
        for(int i =0 ; i < n-k ; i++){
            sum+=cardPoints[i];
        }
        int minsum = sum;
        int i = 0;
        int j = n - k-1;
        while(j < n-1){
            sum+=cardPoints[++j];
            sum-=cardPoints[i++];
            minsum = Math.min(sum,minsum);
        }
        return totalsum - minsum;
    }
}