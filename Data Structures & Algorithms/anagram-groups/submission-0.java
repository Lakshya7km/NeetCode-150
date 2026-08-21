class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n =strs.length;
      List<List<String>> list = new ArrayList<>();
boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
               continue;
              }
             ArrayList<String> l = new ArrayList<>();
             l.add(strs[i]);
             
            for(int j=i+1;j<n;j++){
              if(strs[i].length()!=strs[j].length()){
                continue;
              }
              
          
               if(check(strs[i],strs[j])){
                    l.add(strs[j]);
                     visited[j]=true;
               }
               
                

            } list.add(l);
          

           
        }
        return list;
    }



    
    public static boolean check(String s,String t){
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

return true;
    }
}
