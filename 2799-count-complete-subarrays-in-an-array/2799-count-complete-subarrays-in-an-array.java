class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        int totaldistinct = 0;
        for(int x : nums){
            if(!distinct.contains(x)){
                totaldistinct++;
                distinct.add(x);
            }
        }
        int subdistinct = 0;
        int l = 0, r = 0;
        int n = nums.length;
        int count =0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(r < n ){
            if(!mp.containsKey(nums[r])){
                subdistinct++;
            }
            mp.put(nums[r],mp.getOrDefault(nums[r],0) + 1);
             
            while(subdistinct == totaldistinct){
                count += n - r;
                if(mp.get(nums[l]) == 1){
                    mp.remove(nums[l]);
                    subdistinct--;
                }else{
                    mp.put(nums[l] , mp.get(nums[l]) - 1);
                }
                l++;
            }
            r++;
        }
        return count;
    }
}