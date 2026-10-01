class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int n = s.length();
        int max = 0;
        int cost = 0;
        int l = 0;
        int r = 0;


        while (r < n) {
            cost += Math.abs(s.charAt(r) - t.charAt(r));
            while (l <= r && cost > maxCost) {
                cost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}