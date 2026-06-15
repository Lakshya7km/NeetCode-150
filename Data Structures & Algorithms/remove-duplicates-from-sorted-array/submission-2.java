class Solution {
    public int removeDuplicates(int[] nums) {
        //  ArrayList<Integer> list =  new ArrayList<>();
        //  for(int i=0;i<nums.length;i++){
        //     if(!list.contains(nums[i])){
        //         list.add(nums[i]);
        //     }
        //     nums[i]=0;
        //  }
        // int k = list.size();

        // for(int j =0;j<k;j++){
        //     nums[j] = list.get(j);
        // }
     int j = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        int k = j;
        
        return k;
    }
}