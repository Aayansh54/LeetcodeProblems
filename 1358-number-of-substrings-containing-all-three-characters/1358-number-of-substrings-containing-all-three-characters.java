class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0 , r = 0;
        Map<Character , Integer> mp = new HashMap<>();
        int count = 0;
        int n = s.length();
        while(r < n){        
            mp.put(s.charAt(r) , mp.getOrDefault(s.charAt(r),0) + 1);
            while(mp.containsKey('a') && mp.containsKey('b') && mp.containsKey('c')){
                count += n - r;
                if(mp.get(s.charAt(l)) == 1){
                    mp.remove(s.charAt(l));
                }else{
                    mp.put(s.charAt(l),mp.get(s.charAt(l)) - 1);
                }
                l++;
            }
            r++;
        }
        return count;
    }
}