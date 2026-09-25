class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int l = 0; int r = 0;
        long good = 0;
        int pairs = 0;
        Map<Integer,Integer>freq = new HashMap<>();
        while(r<n){
                if(freq.containsKey(nums[r])){
                    pairs += freq.get(nums[r]);
                }
                freq.put(nums[r],freq.getOrDefault(nums[r],0) + 1);
                while(pairs >= k){
                    good += n - r;
                    if(freq.containsKey(nums[l])){
                        pairs -= freq.get(nums[l]) - 1;
                        freq.put(nums[l] , freq.get(nums[l] )- 1);
                    }
                    l++;
                }
            r++;    
            }
            return good;
        }
        
    }
