import java.util.HashSet;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set1 = new HashSet<>();
        int max = 0;
        for(int x : nums){
           if(x % k == 0) {
            set1.add(x);
           }
        }
        int i = 1;
        int multiple = k;
        while(set1.contains(multiple)){
            i++;
            multiple = k * i;
        }
        return multiple;
    }
}