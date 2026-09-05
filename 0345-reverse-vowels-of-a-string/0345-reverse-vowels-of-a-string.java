class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] S = s.toCharArray();
        while(i < j){
          if("AEIOUaeiou".indexOf(S[i]) == -1) {
            i++;
            continue;
          }
          if("AEIOUaeiou".indexOf(S[j]) == -1){
            j--;
            continue;
          }
          char temp = S[i];
          S[i] = S[j];
          S[j] = temp;
          i++;
          j--;
        }
        return new String(S);
    }
}