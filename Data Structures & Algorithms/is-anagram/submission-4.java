class Solution {
    public boolean isAnagram(String s, String t) {
       
   //optimised

   if(t.length()!=s.length()) return false;

    int[] arr = new int[26];
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        char ch1 = t.charAt(i);
        arr[ch-'a']++;
        arr[ch1-'a']--;
    }

    

for(int el:arr){
    if(el != 0){
        return false;
    }
}
    
      //  HashMap<Character,Integer> map = new HashMap<>();

      //  for(int i=0;i<s.length();i++){
      //   char ch = s.charAt(i);
      //   map.put(ch,map.getOrDefault(ch,0)+1);
        
      //  }



      //  for(int j=0;j<t.length();j++){
      //        char ch1 = t.charAt(j);
      //        map.put(ch1,map.getOrDefault(ch1,0)-1);
      //  }

      //  for(Integer val : map.values()){
      //   if(val!=0){
      //     return false;
      //   }
      //  }

       return true;


    }
}
