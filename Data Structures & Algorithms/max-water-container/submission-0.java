class Solution {
    public int maxArea(int[] heights) {
        int maxwater=0;
        int start=0;
        int end=heights.length-1;
        while(start<end)
        {
            int width=end-start;
            int minheight=Math.min(heights[start],heights[end]);
            int water=width*minheight;
            if(maxwater<water)
            {
                maxwater=water;
            }
            if(heights[start]<heights[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return maxwater;
    }
}
