class Solution {
    public int numberOfSubstrings(String s) {
        char[] S = s.toCharArray();
        int l = 0 , r = 0;
        Map<Character , Integer> mp = new HashMap<>();
        int count = 0;
        int n = S.length;
        while(r < n){        
            mp.put(S[r] , mp.getOrDefault(S[r],0) + 1);
            while(mp.containsKey('a') && mp.containsKey('b') && mp.containsKey('c')){
                count += n - r;
                if(mp.get(S[l]) == 1){
                    mp.remove(S[l]);
                }else{
                    mp.put(S[l],mp.get(S[l]) - 1);
                }
                l++;
            }
            r++;
        }
        return count;
    }
}