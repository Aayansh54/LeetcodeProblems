/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int left = 0;
        int right = length - 1;
        int peak = 0;
        while(left < right){
           int mid = (left + right)/2;
           if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
           left = mid + 1;
           }
           else
           right = mid;
    }   
       peak = left;
       int leftsideidx = length;
       int rightsideidx = length;
       left = 0;
       right = peak;
       while(left <= right){
        int mid = (left + right)/2;
        if(mountainArr.get(mid) == target){
            leftsideidx = mid;
            break;
        }
        else if(mountainArr.get(mid) > target){
            right = mid - 1;
        }
        else
            left = mid + 1;
       }
       left = peak + 1;
       right = length - 1;
        while(left <= right){
        int mid = (left + right)/2;
        if(mountainArr.get(mid) == target){
            rightsideidx = mid;
            break;
        }
        else if(mountainArr.get(mid) > target){
           left = mid + 1;
        }
        else
          right = mid - 1;
       }
       if(leftsideidx < rightsideidx) return leftsideidx;
       if(leftsideidx > rightsideidx) return rightsideidx;
       return -1;
}
}