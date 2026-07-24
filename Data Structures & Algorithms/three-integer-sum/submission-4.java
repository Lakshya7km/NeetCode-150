class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> list2d=new ArrayList<>();
        Arrays.sort(nums);
        //nums[i] + [nums[left]+num[right]]=0
        //[nums[left]+num[right]]=-1*nums[i]
        for(int i=0;i<nums.length-2;i++) {
            // if(nums[i]!=0&&nums[i]==nums[i+1]){
            //     continue;
            // }else {

                int el = nums[i];
                int left = i+1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = -1 * el;
                    if (nums[left] + nums[right] == sum) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[left]);
                        list.add(nums[right]);
                        list.add(el);
                        if(!list2d.contains(list)){
                            list2d.add(list);
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > sum) {
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    }
                }
            // }
        }
       return list2d;
    }
}
