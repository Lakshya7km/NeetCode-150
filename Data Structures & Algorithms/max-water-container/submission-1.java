class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int maxArea = 0;
        // for(int i=0;i<heights.length;i++){
        //     for(int j=i+1;j<heights.length;j++){
        //         area = (j-i)*(Math.min(heights[i],heights[j]));
        //         if(area>maxArea){
        //             maxArea=area;
        //         }
        //     }
        // }
        
        int left =0;
        int right = heights.length-1;
        while (left < right){
            area = Math.max(area,(right-left)*(Math.min(heights[left],heights[right])));
            // System.out.println(h[left]+" "+h[right] +" "+area   );
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
