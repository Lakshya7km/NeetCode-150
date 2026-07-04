class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

    //     //brute force coopy element of nums2 and paste in the nums1 then sort o(n2)
    //   for(int i=0;i<n;i++){
        
    //    nums1[m+i]=nums2[i];
        
    //   }
    //    Arrays.sort(nums1);



    //optimal version
    int i=0;
    int j=0;
    int k=0;
    int[] arr=new int[m+n];
    while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            arr[k]=nums1[i];
            i++;
            k++;
        }else if(nums1[i]>nums2[j]){
            arr[k]=nums2[j];
            j++;
            k++;
            
        }
    }
    while(i<m){
          arr[k]=nums1[i];
            i++;
            k++;

    }
    while(j<n){
         arr[k]=nums2[j];
            j++;
            k++;
            
    }

    //copy el from array to nums1
    for(int l=0;l<m+n;l++){
        nums1[l]=arr[l];
    }
            }
}