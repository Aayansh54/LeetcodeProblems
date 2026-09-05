class Solution {
    public String reverseWords(String s) {
        char[] ans = s.toCharArray();
        int i = 0;
        int j = 0;
        int n = ans.length;
        while(j < n){
        while(j < n && ans[j] != ' '){
            j++;
        }
        reverse(i,j-1,ans);
        j++;
        i=j;
        }
        return new String(ans);
    }
    void reverse(int i , int j,char[] s){
        while(i<j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
        }
    }
}