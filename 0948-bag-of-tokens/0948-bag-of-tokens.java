class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int i = 0;
        int j = n - 1;
        int score = 0;
        int maxscore = 0;
        while(i <= j){
            if( power >= tokens[i]){
                power -= tokens[i];
                score++;
                i++;
                maxscore = Math.max(maxscore , score);
            }
            else if(score >= 1){
                power += tokens[j];
                j--;
                score--;
            }
            else{
                return maxscore;
            }
        }
        return maxscore;
    }
}