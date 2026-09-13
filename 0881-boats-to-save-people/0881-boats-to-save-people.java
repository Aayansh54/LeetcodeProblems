class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int i = 0;
        int n = people.length;
        int j = n-1;
        while(i < j){
            if(people[i] +people[j] > limit){
                boats++;
                j--;
            }
            else{
                boats++;
                i++;
                j--;
            }
        }
        if(i == j) boats++;
        return boats;
    }
}