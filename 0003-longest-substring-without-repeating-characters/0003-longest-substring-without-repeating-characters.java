class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set<Character> unique = new HashSet<>();

     int l = 0;
     int r = 0;
     int n = s.length();
    int ans = 0;
     while(r < n){
        while(!unique.isEmpty() && unique.contains(s.charAt(r))){
            unique.remove(s.charAt(l));
            l++;
        }
        unique.add(s.charAt(r));
        ans = Math.max(ans,unique.size());
        r++;
     }
     return ans;
    }
}