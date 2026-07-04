class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      
        int n= nums.length;

        int l=0;
        int r=n-1;
         while(l<r){

            int sum =  nums[l]+nums[r];

            if(sum==target){
                return new int[]{l+1,r+1};
            }
            else if(sum>0){
                r--;
            }else if(sum<0){
                l++;
            }
         }
          return new int[]{-1,-1};
    }
}
