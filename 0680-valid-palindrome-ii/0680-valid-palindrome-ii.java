class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        int candelete =0;
        while( i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return ispalindrome(i,j-1,s) || ispalindrome(i+1,j,s);
            }
            i++;
            j--;
        }
        return true;
    }
    boolean ispalindrome(int i , int j , String s){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}