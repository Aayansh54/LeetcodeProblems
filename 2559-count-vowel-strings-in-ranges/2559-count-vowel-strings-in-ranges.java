class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] goodWords = new int[words.length + 1];
        int[] ans = new int[queries.length];

        if (isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1))) {
            goodWords[0] = + 1;
        }

        int n = words.length;
        for (int i = 1; i < n; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (isVowel(first) && isVowel(last)) {
                goodWords[i] = goodWords[i-1] + 1;
            } else {
                goodWords[i] = goodWords[i-1];
            }
        }

        int m = queries.length;
        for (int i = 0; i < m; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int val = left == 0 ? goodWords[right] : goodWords[right] - goodWords[left - 1];
            ans[i] = val;
        }
        return ans;
    }

    boolean isVowel(char s) {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
