class Solution {
    public int largestAltitude(int[] gain) {
        int altitudes = 0;
        int ans = 0;
        int n = gain.length;
        for(int i = 0 ; i < n  ; i++){
            altitudes += gain[i];
            ans = Math.max(ans,altitudes);
        }
        return ans;
    }
}