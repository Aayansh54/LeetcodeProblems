class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        char[] P = p.toCharArray();
        char[] S = s.toCharArray();

        int[] Pfreq = new int[26];
        int[] subfreq = new int[26];

        int k = P.length;
        int n = S.length;

        if(k > n){
            return ans;
        }

        for(char x : P){
            Pfreq[x - 'a']++;
        }
        for(int i = 0 ; i < k ; i++){
            subfreq[S[i] - 'a']++;
        }

        int l = 0 ; 
        int r = k;
      
        if(Arrays.equals(subfreq,Pfreq)) {
            ans.add(l);
        }

        while(r < n){
            subfreq[S[r] -'a']++;
            subfreq[S[l] -'a']--;
                
                l++;
                r++;
                
            if(Arrays.equals(subfreq,Pfreq)) {
                ans.add(l);
            }
              
        }
        return ans;
    }
}