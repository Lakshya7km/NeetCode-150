class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];  
        int n = nums.length-1;
        for(int i = 0; i<=n;i++){
            ans[i] = nums[i];
            ans[n+1+i] = nums[i];
        }
        return ans;
    }
}