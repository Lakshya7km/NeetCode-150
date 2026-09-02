class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot =-1;
        for(int i=n-1;i>0;i--){
            int left = nums[i];
            int right=nums[i-1];
            
            //find the pivot index where left>right
            if(left>right){
                pivot = i-1;
                for(int j=n-1;j>pivot;j--){
                    if(nums[j]>nums[pivot]){
                        //smallest larger element then the el at pivot
                        int temp = nums[j];
                        nums[j]=nums[pivot];
                        nums[pivot]=temp;
                        break;
                    }
                }
                reverse(nums,pivot+1,n-1);
                break;
            }

            //now reverse the right part of the array after pivot+1 index to end
            //if pivot never found means 
            if(i==1){
                reverse(nums,0,n-1);
            }

        }
    }
    public int[] reverse(int[] arr,int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
}