class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r = s.length()-1;
        while(l<r){
             char cleft = s.charAt(l);
             char cright = s.charAt(r);
              if(!Character.isLetterOrDigit(cleft)) {
                   l++;
              } 
    else if(!Character.isLetterOrDigit(cright)){
             r--;
        }
              else{
                if(Character.toLowerCase(cleft)!=Character.toLowerCase(cright)){
                  return false;
                } 
                l++;
                r--;
              }
        } 
        return true;
    }
}