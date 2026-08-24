class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       if(n==0)return 0;
       int maxCount=1;
       int count=1;
      HashSet<Integer> set = new HashSet<>();
      for(int el:nums){
        set.add(el);
      }

      int maxLen = set.size();

      for(int l:set){

        int curr = l;
        int prevEl = l-1;
       
        if(!set.contains(prevEl)){
            count=1;
            int nextEl=l+1;
            while(set.contains(nextEl)){
                nextEl++;
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
      }
       return maxCount;
    }
}