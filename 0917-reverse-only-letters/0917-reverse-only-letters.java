class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0 ;
        int j = s.length() - 1;
        char[] ans = s.toCharArray();
        while(i < j){
            if(!Character.isLetter(ans[i])) {
                i++;
                continue;
            }
            if(!Character.isLetter(ans[j])){
                 j--;
                 continue;
            }
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;  
        }
        return new String(ans);
    }
}