class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftmax =height[left];
        int rightmax=height[right];
        int res=0;

        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,height[left]);
                res+=leftmax-height[left];
            }else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                res+=rightmax-height[right];
            }
        }

        return res;
    }
}
