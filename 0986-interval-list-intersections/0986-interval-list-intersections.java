class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0 ;
        int j = 0;
        List<int[]> ans = new ArrayList<>();
        while(i < firstList.length && j < secondList.length){
            int first = Math.max(firstList[i][0] , secondList[j][0]);
            int second = Math.min(firstList[i][1] , secondList[j][1]);
            if(first <= second)
            ans.add(new int[]{first, second});
            if(firstList[i][1]> secondList[j][1]){
                j++;
            }
            else i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}