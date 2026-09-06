class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] seen = new int[1001];
    //  ArrayList<Integer> ans = new ArrayList<>();
        for(int x : nums1){
            seen[x] = 1;
        }
        int[] ans = new int[nums2.length];
        int k = 0;
        for(int x : nums2){
            if(seen[x] == 1){
                ans[k++] = x;
                seen[x] = 2;
            }
        }
        // for(int i = 0 ; i < 1001 ; i++){
        //     if(seen[i] > 1) ans.add(i);
        // }
        // int[] intersection = new int[ans.size()];
        // for(int i = 0 ; i < ans.size() ; i++){
        //     intersection[i] = ans.get(i);
        // }
        return Arrays.copyOf(ans,k);
    }
}