class Solution {

   

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

         for(int i=0;i<strs.size();i++){
            
        int len=strs.get(i).length();
          sb.append(len).append("#").append(strs.get(i));
        
         }
      String  encoded_string =  new String(sb);

        return encoded_string;
    }

    public List<String> decode(String str) {
           List<String> decoded_strs = new ArrayList<>();
           int i=0;
           int start =0;
           while(i<str.length()){
            //x tak jao
            while(str.charAt(i)!='#'){
                
                i++;
            }

            //length find karo string ka
            int len = Integer.parseInt(str.substring(start,i));

            //#cross
            i++;
            
            //len chracter list me add karna
            decoded_strs.add(str.substring(i,i+len));

            //pointer move
            i=i+len;
            start=i;
           }
           return decoded_strs;

            
    }
}
