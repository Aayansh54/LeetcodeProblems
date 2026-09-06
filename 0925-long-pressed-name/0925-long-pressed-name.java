class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0 ;
        int j = 0;
        int namel = name.length();
        int typedl = typed.length();
        if(typedl<namel)return false;
      
        char temp = name.charAt(0);
        while(i < namel && j < typedl){
            if(name.charAt(i) == typed.charAt(j)){
                temp = name.charAt(i);
                i++;
                j++;
            }
            else if(typed.charAt(j) == temp){
                j++;
            }
            else
            return false;
        }
        if(i < namel) return false;
        while(j < typedl){
            if(typed.charAt(j) == temp)
            j++;
            else
            return false;
        }
        return true;
    }
}