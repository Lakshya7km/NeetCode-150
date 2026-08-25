class Solution {
    public int trap(int[] height) {
         int n=height.length;
            //brute force
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(rightmax[j+1],height[j]);
        }
         int ans=0;
        //water traped 
        for(int k=0;k<n;k++){
            if((Math.min(leftmax[k],rightmax[k])-height[k])<0){
                ans+=0;
            }else{
                ans+=Math.min(leftmax[k],rightmax[k])-height[k];
            }
        }
        //optimal
    
        // int left=0;
        // int right=n-1;
        // int leftmax =height[left];
        // int rightmax=height[right];
        // int res=0;

        // while(left<right){
        //     if(leftmax<rightmax){
        //         left++;
        //         leftmax=Math.max(leftmax,height[left]);
        //         res+=leftmax-height[left];
        //     }else{
        //         right--;
        //         rightmax=Math.max(rightmax,height[right]);
        //         res+=rightmax-height[right];
        //     }
        // }

        // return res;
        return ans;
    }
}
