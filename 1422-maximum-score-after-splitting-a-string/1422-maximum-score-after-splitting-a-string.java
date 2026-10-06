class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] zeroCount = new int[n];

        if (s.charAt(0) == '0') {
            zeroCount[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '0') {
                zeroCount[i] = zeroCount[i - 1] + 1;
            } else {
                zeroCount[i] = zeroCount[i - 1];
            }
        }
        int ans = 0;
        for(int i = 0 ;i < n - 1 ; i++){
            int rOneCount = n - (i+1) - (zeroCount[n-1] - zeroCount[i]);
            int score = zeroCount[i] + rOneCount;
            ans = Math.max(score,ans);
        }
        return ans;
    }
}

//1 2 2 2 2