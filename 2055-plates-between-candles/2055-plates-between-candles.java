class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int m = queries.length;
        int[] prevCandle = new int[n];
        int[] nextCandle = new int[n];
        int[] Prefix = new int[n];
        int[] ans = new int[m];

            if(s.charAt(0) == '*'){
                Prefix[0] = 1;
            }
        for(int i = 1 ; i < n ; i++){
            if(s.charAt(i) == '*'){
                Prefix[i] = Prefix[i-1] + 1;
            }else{
                Prefix[i] = Prefix[i-1];
            }
        }
        int prevIdx = 0;
        int nextIdx = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '|'){
                prevIdx = i;
            }
            prevCandle[i] = prevIdx;

            if(s.charAt(n-i-1) == '|'){
                nextIdx = n-i-1;
            }

            nextCandle[n-i-1] = nextIdx;
        }

        for(int i = 0 ; i < m ; i++){
            int start = queries[i][0];
		    int end = queries[i][1];

            int startIdx = nextCandle[start] <= end ? nextCandle[start] : 0;
            int endIdx = prevCandle[end] >= start ? prevCandle[end] : 0;
            ans[i] = Prefix[endIdx] - Prefix[startIdx] ;
        }
        return ans;
    }
}
//      0  1  1  3  4  5  6    7  8  9  10 11 12  13  14  15  16  17  18  19  20
// prev 0  0  0  3  3  3  6    6  6  6  6  6  12  12  12  15  16  16  16  19  19
// next 3  3  3  6  6  6  12  12  12  12  12  12  15  15  15  16  19  19  19  0

// prefix