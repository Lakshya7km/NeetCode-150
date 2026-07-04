class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
        
        
    }
    public void reverse(int[] arr,int i,int j){
        int left=i;
        int right=j;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}