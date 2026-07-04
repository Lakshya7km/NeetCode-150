class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
       boolean flag = false;
       
        for(int i =0;i<n;i++){
          
       if(i+1<n){ if(nums[i] == nums[i+1]){
            flag = true;
            break;
        }else flag = false;
       } 
        }
     return flag;      
        
    }
}