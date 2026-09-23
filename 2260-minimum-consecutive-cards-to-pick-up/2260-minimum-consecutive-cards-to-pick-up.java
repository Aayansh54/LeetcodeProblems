class Solution {
    public int minimumCardPickup(int[] cards) {
        Set<Integer> Cards = new HashSet<>();
        int l = 0;
        int r = 0;
        int n  = cards.length;
        int min = n +1 ;
        while(r < n){
            while(Cards.contains(cards[r])){
                min = Math.min(min,r-l+1);
                Cards.remove(cards[l]);
                l++;
            }
            Cards.add(cards[r]);
            r++;
        }
        if(min == n +1) return -1;
        else return min;
    }
}