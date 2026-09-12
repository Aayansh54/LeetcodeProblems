class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int i = 0 , j = n;
        int[] ans = new int[n+1];
        int k = 0;
        for(int x = 0 ; x < n ; x++){
            if(s.charAt(x) == 'I'){
                ans[k++] = i++;
            }
            else
            ans[k++] = j--;
        }
        ans[k] = i;
        return ans;
    }
}