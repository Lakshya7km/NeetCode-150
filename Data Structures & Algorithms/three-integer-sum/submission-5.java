
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        if (n < 3) {
            return result;
        }

        // fixing 1 element n1 
        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int n1 = nums[i];
            int target = -1 * n1;

            twoSum(nums, target, i + 1, n - 1, result); // find n2 and n3 for me
        }
        return result;
    }

    public void twoSum(int[] nums, int target, int i, int j, List<List<Integer>> result) {
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                // found valid triplet
                result.add(Arrays.asList(-1 * target, nums[i], nums[j]));

                // first we will remove duplicate form either end i or j
                while (i < j && nums[i] == nums[i + 1]) i++;
                while (i < j && nums[j] == nums[j - 1]) j--;

                // move both pointer inward
                i++;
                j--;
            }
        }
    }

    // //nums[i] + [nums[left]+num[right]]=0
    // //[nums[left]+num[right]]=-1*nums[i]
    // for(int i=0;i<nums.length-2;i++) {
    //     // if(nums[i]!=0&&nums[i]==nums[i+1]){
    //     //     continue;
    //     // }else {

    //         int el = nums[i];
    //         int left = i+1;
    //         int right = nums.length - 1;
    //         while (left < right) {
    //             int sum = -1 * el;
    //             if (nums[left] + nums[right] == sum) {
    //                 ArrayList<Integer> list = new ArrayList<>();
    //                 list.add(nums[left]);
    //                 list.add(nums[right]);
    //                 list.add(el);
    //                 if(!list2d.contains(list)){
    //                     list2d.add(list);
    //                 }
    //                 left++;
    //                 right--;
    //             } else if (nums[left] + nums[right] > sum) {
    //                 right--;
    //             } else if (nums[left] + nums[right] < sum) {
    //                 left++;
    //             }
    //         }
    //     // }
    // }
}