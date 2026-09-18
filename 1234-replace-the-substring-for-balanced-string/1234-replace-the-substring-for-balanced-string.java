class Solution {
    public int balancedString(String s) {
        char[] S = s.toCharArray();

        int n = S.length;

        int w = 0, e = 0, r = 0, q = 0;

        int occ = n / 4;

        for (char x : S) {
            if (x == 'W')
                w++;
            else if (x == 'E')
                e++;
            else if (x == 'R')
                r++;
            else
                q++;
        }
        if(w == occ && e == occ && r == occ && q == occ) return 0;

        int left = 0;
        int right = 0;
        int wCount = 0, rCount = 0, qCount = 0, eCount = 0;
        int min = Integer.MAX_VALUE;

        while (right < n) {
            if (S[right] == 'W') {
                wCount++;
            } else if (S[right] == 'R') {
                rCount++;
            } else if (S[right] == 'Q') {
                qCount++;
            } else if (S[right] == 'E') {
                eCount++;
            }
            right++;

            while (left < right && (w - wCount <= occ && r - rCount <= occ && q - qCount <= occ && e - eCount <= occ)) {

                min = Math.min(min, right - left);

                if (S[left] == 'W') {
                    wCount--;
                } else if (S[left] == 'E') {
                    eCount--;
                } else if (S[left] == 'R') {
                    rCount--;
                } else
                    qCount--;
               left++; 
            }
        }
        return min;
    }
}