class Solution {
    public int maxVowels(String s, int k) {
        char[] S = s.toCharArray();
        int vowelcount = 0;
        int n = S.length;
        for(int i = 0 ; i < k ; i++){
            if(isvowel(S[i])){
                vowelcount++;
            }
        }
        int max = vowelcount;
        int left = 0;
        int right = k-1;
        while(right < n-1){
            if(isvowel(S[++right])){
                vowelcount++;
            }
            if(isvowel(S[left++])){
                vowelcount--;
            }
            max = Math.max(max,vowelcount);
        }
        return max;
    }
    boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else
        return false;
    }
}