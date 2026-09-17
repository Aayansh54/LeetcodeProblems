class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] S = s.toCharArray();
        Set<Character> st = new HashSet<>();
        int max = 0;
        int n = S.length;
        int left = 0;
        int right = 0;
        while(right < n){
            if(st.contains(S[right])){
            while(st.contains(S[right])){
                st.remove(S[left]);
                left++;
            }
            }
            else{
                st.add(S[right]);
                right++;
                max = Math.max(max,st.size());
            }
        }
        return max;
    }
}