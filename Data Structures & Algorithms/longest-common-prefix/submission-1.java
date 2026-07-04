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

    for(int j =0; j< min;j++){
        el = strs[0].charAt(j);
        count = 0;
        if(strs[0].charAt(0)!=strs[1].charAt(0)){
                break;
            }
        for(int k = 0;k<strs.length;k++){
            if(el==strs[k].charAt(j)){
                count+=1;
            }
            if(count==strs.length){
                ch = ch+strs[k].charAt(j);

            }
           
        }
        
    }return ch;
    }
}