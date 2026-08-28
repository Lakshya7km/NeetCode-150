class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute force worked no tle o(n2) tc and o(n) sc
        int result =0;
        int n=s.length();
        HashSet<Character> set = new HashSet<>();
        int left=0;


        for(int j=0;j<n;j++){



            //shrink the window when the substring found invalid
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(left));
                left++;
            }
            
                set.add(s.charAt(j));
            
            //update the set size
            result=Math.max(result,set.size());



        }
        return result;
    }
}