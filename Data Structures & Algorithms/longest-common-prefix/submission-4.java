class Solution {
    public String longestCommonPrefix(String[] strs) {
    Character ch;
    String ans ="";
           if(strs.length==1){
             return strs[0];
           }else {for(int i = 0; i < strs[0].length();i++){
                ch = strs[0].charAt(i);
                boolean match = true;
                for(int j = 0; j< strs.length;j++){
                    if(ch!=strs[j].charAt(i)|| strs.length<i){
                        match  = false;
                        break;
                    }
                }if(match==false){
                    break;
                }else{
                    ans =ans+ ch;
                }
            }}return ans;
    }
}