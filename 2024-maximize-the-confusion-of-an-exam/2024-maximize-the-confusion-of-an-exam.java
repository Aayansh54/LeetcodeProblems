class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] answers = answerKey.toCharArray();
        int left = 0 , right = 0;
        int Tcount = 0;
        int Fcount = 0;
        int minTF = 0;
        int ans = 0;
        int n = answers.length;
        while(right < n){
            if(answers[right] =='T'){
                Tcount++;
            }else Fcount++;
            minTF = Math.min(Tcount ,Fcount);
            if(minTF >k){
                if(answers[left] == 'F'){
                    Fcount--;
                }else Tcount--;
                left++;
            }
            ans = Math.max(ans,right-left + 1);
            right++;
        }
        return ans;
    }
}