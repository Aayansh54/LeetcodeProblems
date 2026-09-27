class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] S1 = s1.toCharArray();
        char[] S2 = s2.toCharArray();

        int[] s1freq = new int[26];
        int[] subfreq = new int[26];

        int k = S1.length;
          int n = S2.length;

          if(k > n){
            return false;
          }
        for(char x : S1){
            s1freq[x - 'a']++;
        }
        for(int i = 0 ; i < k ; i++){
            subfreq[S2[i] - 'a']++;
        }

        int l = 0 ; 
        int r = k;
      
        if(Arrays.equals(subfreq,s1freq)) return true;

        while(r < n){
            subfreq[S2[r] -'a']++;
            subfreq[S2[l] -'a']--;
            if(Arrays.equals(subfreq,s1freq)) return true;
            else{
                l++;
                r++;
            }
        }
        return false;
    }
}