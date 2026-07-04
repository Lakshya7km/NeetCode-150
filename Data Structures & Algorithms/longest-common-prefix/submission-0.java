class Solution {
    public String longestCommonPrefix(String[] strs) {
        Character el='x';
        String ch = "";
        int min = strs[0].length();
        int count = 0;
        for(int i =0;i<strs.length;i++){
            if(strs[i].length()<min){
              min =strs[i].length();
            }
        }
        if(strs[0].charAt(0)!=strs[1].charAt(0)){
            return ch;
        }else{
        for(int j =0; j< min;j++){
            el = strs[0].charAt(j);
            for(int k = 0;k<strs.length;k++){
                if(el==strs[k].charAt(j)){
                    count+=1;
                }
                
                if(count==strs.length){
                    count = 0;
                    ch = ch+strs[k].charAt(j);
                }
            }
        }}return ch;
    }
}