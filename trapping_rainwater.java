class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int leftmax=0,rightmax=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>leftmax)  
            {
                leftmax=height[i];
            }
            left[i]=leftmax;
        }
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>rightmax)
            {
                rightmax=height[i];
            }
            right[i]=rightmax;
        }
        int amt=0;
        for(int i=0;i<height.length;i++)
        {
            amt=amt+(Math.min(left[i],right[i])-height[i]);
        }
        return amt;
    }
}
