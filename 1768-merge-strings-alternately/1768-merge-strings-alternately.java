class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        String ans = "";
        int i = 0 ; 
        int j = 0;
        while(i < n1 && j < n2){
            ans += word1.charAt(i++);
            ans += word2.charAt(j++);
        }
        while(i<n1){
            ans +=  word1.charAt(i++);
           
        }
        while(j<n2){
            ans +=  word2.charAt(j++);
        }
        return ans;
    }
}
