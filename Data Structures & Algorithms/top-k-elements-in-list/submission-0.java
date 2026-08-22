class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
              map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }


         //step1 make a List of entry
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());

         //2.sort the key,value based on the frequency in descending order use comparator
         list.sort((a,b)-> b.getValue()-a.getValue());


        //pick the key having most freq element choose k elemnet form starting of the List 
        int[] arr = new int[k];
       for (int i = 0; i < k; i++) {
    arr[i] = list.get(i).getKey();
}

       
        return arr;
    }
}