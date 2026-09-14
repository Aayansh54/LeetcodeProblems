class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j =(int) Math.sqrt(c);
        
        while( i <= j){
            long squaresum = (long)i*i + (long)j*j;
            if(squaresum > c){
                j--;
            }
            else if(squaresum < c) i++;
            else return true;
        }
        return false;
    }
}