class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] goodWords = new int[words.length + 1];
        int[] ans = new int[queries.length];

        goodWords[0] = 0;
        
        int n = words.length;
        for(int i = 0 ; i < n ; i++){
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() -1);
            if(isVowel(first) && isVowel(last)){
                goodWords[i+1] = goodWords[i] + 1;
            }else{
                goodWords[i+1]  = goodWords[i];
            }
        }

        int m = queries.length;
        for(int i = 0 ; i < m ; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int val = goodWords[right+1] - goodWords[left];
            ans[i] = val;
        }
        return ans;
    }
    boolean isVowel(char s){
        if(s == 'a' || s=='e' || s == 'i' || s == 'o' || s=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
//0 1 2 3 4 5  
//0 1 1 2 3 4

//0 1 2 3
//0 1 2 3