class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int[] prefix = new int[n];
        // int prod1;
        // int prod2;
        // for(int i=0;i<n;i++){
        //     int j=0;
        //     prod1=1;
        //     while(j<i){
        //        prod1*=nums[j];
        //        j++;
        //     }
        //     int k=i+1;
        //     prod2=1;
        //      while(k<n){
        //        prod2*=nums[k];
        //        k++;
        //     }

        //     arr[i]=prod1*prod2; 
        // }
        // return arr;

        //ans as prefix
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        //suffix array
        //prefix - 1,1,2,8
        int suffix=1;
        for(int j=n-1;j>=0;j--){
            prefix[j]=prefix[j]*suffix;
            suffix=suffix*nums[j];
        }

        return prefix;
    }
}  
