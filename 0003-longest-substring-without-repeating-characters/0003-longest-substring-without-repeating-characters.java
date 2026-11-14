class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0 ){
            return 0;
        }
        if(s.length() == 1 ){
            return 1;
        }
        int left =0;
        int rigth = 0;
        int max = 0;
        HashSet <Character> set = new HashSet<>();
         
         while(rigth<s.length()){
            char c = s.charAt(rigth);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);;
            max = Math.max(max,rigth - left +1);
            rigth++;
         }
         return max;
    }
}