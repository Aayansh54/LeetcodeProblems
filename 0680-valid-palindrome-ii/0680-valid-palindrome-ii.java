class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        int candelete =0;
        while( i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else if(candelete == 0 && s.charAt(i) != s.charAt(j)){
                if(i<j && ispalindrome(i,j-1,s)){
                    candelete = 1;
                    j--;
                }
                else if(i<j && ispalindrome(i+1,j,s)){
                    candelete = 1;
                    i++;
                }
                else 
                return false;
            }
            else
            return false;
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