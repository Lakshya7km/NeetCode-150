class Solution {
    public int maxSubArray(int[] nums) {
      int prevSum = 0;
      int n =nums.length;
      if(n==1)return nums[0];
      int start =0;
        int maxSum = Integer.MIN_VALUE;
      for(int i=start;i<n;i++){
        int sum = prevSum;
        int x = nums[i];
      
        sum+=x;
        if(sum<x){
            //skip this 
            start = i;
            prevSum = x;
        }else{
            //include this subarray sum
            prevSum = sum;
            
        }
        maxSum =Math.max(maxSum,prevSum);
      }
      return maxSum;
    }
}