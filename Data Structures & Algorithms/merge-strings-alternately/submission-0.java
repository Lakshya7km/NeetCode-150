class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb = new StringBuilder(); 
       int n=word1.length()+word2.length();
       int l=0;
       int r=0;
     
        
        while(l<word1.length() || r<word2.length()){
           if(l<word1.length()){ sb.append(word1.charAt(l));
            l++;}
           if(r<word2.length()){ sb.append(word2.charAt(r));
            r++;}

        
       }
       String ans = new String(sb);
       return ans;
    }
}