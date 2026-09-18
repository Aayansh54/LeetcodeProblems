class Solution {
    public int characterReplacement(String s, int k) {
        char[] S = s.toCharArray();
        int left = 0,right = 0;
        int[] freq = new int[26];
        int maxFreq = 0,max = 0;
        int n = S.length;
        while(right < n){
            freq[ S[right] - 'A']++;
            maxFreq = Math.max(maxFreq,freq[S[right]-'A']);
            if((right - left + 1) - maxFreq > k){
            freq[S[left] -'A']--;
                left++;
            }
            max = Math.max((right - left + 1),max);
            right++;
        }
        return max;
    }
}