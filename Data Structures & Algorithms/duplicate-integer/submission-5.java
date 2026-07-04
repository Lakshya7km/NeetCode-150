class Solution {
    public boolean hasDuplicate(int[] nums) {
      

     //1. using hashset
      // HashSet<Integer> set = new HashSet<>();

      // for(int i = 0; i <nums.length; i++){
      //   set.add(nums[i]);
      // }
      // if(set.size()==nums.length){
      //   return false;
      // }else{
      //   return true;
      // }


      //2. using xor 
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
                 xor^=nums[i];
        }

        for(int j=1;j<=nums.length;j++){
                xor^=j;
        }

        if(xor==0) return false;
        else return true;
    }
}