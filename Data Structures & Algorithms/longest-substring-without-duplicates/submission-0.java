class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute force worked no tle o(n2) tc and o(n) sc
        int result =0;
        int count=0;
        int n=s.length();
        int start=0;
        for(int i=start;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            count=0;
            for(int j=i;j<n;j++){

                if(!set.contains(s.charAt(j))){
                      count++;
                      result=Math.max(result,count);
                      set.add(s.charAt(j));
                }else{
                    set.clear();
                    start=j;
                    break;
                }
              
                
            }
        }

        return result;
    }
}