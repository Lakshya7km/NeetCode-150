class Solution {
    public boolean validPalindrome(String s) {
        char[]ch = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
         if(ch[l]==ch[r]){
            l++;
            r--;
         }else{
           return ( checkPallindrome(ch,l+1,r)||checkPallindrome(ch,l,r-1));
         }
        }
     
        
      return true;
    }public boolean checkPallindrome(char[] arr,int l,int r){
     
             while(l<r){
                if(arr[l]!=arr[r]){
                    return false;
                }
                l++;
                r--;
             }

             return true;
    }

}