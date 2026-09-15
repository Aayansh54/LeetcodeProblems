class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int right = 2;
        int len = s.length();
        int count = 0;
        while(right < len){
            int mid = (left + right)/2;
            if(s.charAt(mid) != s.charAt(left) && s.charAt(mid) != s.charAt(right) && s.charAt(left)!= s.charAt(right)){
                count++;
            }
            left++;
            right++;
        }
        return count;
    }
}