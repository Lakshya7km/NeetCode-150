class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int i=0;//denotes 0
       int j=0;//denotes 1
       int k=n-1;//denotes 2
       while(j<=k){
        if(nums[j]==1){
            j++;
        }else if(nums[j]==2){
            int temp1 = nums[j];
            nums[j]=nums[k];
            nums[k]=temp1;
            k--;

        }else if(nums[j]==0){
             int temp2 = nums[j];
            nums[j]=nums[i];
            nums[i]=temp2;
            i++;
            j++;
        }
       }

    }
}