class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastocc = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            lastocc[s.charAt(i) - 'a'] = i;
        }
        int i = 0; 
        List<Integer> ans =  new ArrayList<>();
        while (i < n) {
         int end = lastocc[s.charAt(i) - 'a'];
         int j = i;
         while(j < end){
            end = Math.max(end , lastocc[s.charAt(j) - 'a']);
            j++;
        }
        ans.add(j - i + 1);
        i = j + 1;
    }return ans;
}
}