class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int answer = 0;
        int[] occurance = new int[26];

         for(int right = 0 ; right<s.length() ;right++){
          max = Math.max(max,++occurance[s.charAt(right)-'A']);
          if(right - left + 1 - max > k ){
            occurance[s.charAt(left) - 'A']--;
            left++;
          }
          answer = Math.max(answer, right - left + 1);
         }
         return answer;
    }
}