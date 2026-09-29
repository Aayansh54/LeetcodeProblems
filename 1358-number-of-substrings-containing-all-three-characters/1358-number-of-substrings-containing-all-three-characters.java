class Solution {
    public int numberOfSubstrings(String s) {
        char[] S = s.toCharArray();
        char[] freq = new char[26];

        int l = 0;
        int r = 0;
        int n = S.length;
        int ans  = 0;
        while(r < n){
            freq[S[r] -'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                ans += n - r;
                freq[S[l] - 'a']--;
                l++;
            }
            r++;
        }
        return ans;
    }
}