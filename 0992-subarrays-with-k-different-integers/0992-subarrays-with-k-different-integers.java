class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countLessThan(nums,k) - countLessThan(nums,k-1);
    }
    int countLessThan(int[] nums , int k){
        Map<Integer,Integer> mp = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count = 0;
        while(r < n){
            mp.put(nums[r],mp.getOrDefault(nums[r] , 0) + 1);

            while(mp.size() > k){
                if(mp.get(nums[l]) == 1){
                    mp.remove(nums[l]);
                }
                else{
                    mp.put(nums[l],mp.getOrDefault(nums[l] , 0 ) - 1);
                }
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
}
