class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int leftmax=0,rightmax=0;
        //auxilary array to find max height to the left of any block
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>leftmax)  
            {
                leftmax=height[i];
            }
            left[i]=leftmax;
        }
        ////auxilary array to find max height to the right of any block
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>rightmax)
            {
                rightmax=height[i];
            }
            right[i]=rightmax;
        }
        //water can be stored only if there is a block higher than the current block on its left or right
        //amt of water that can be stored is the min height of the left and right block minus the height of the current block
        int amt=0;
        for(int i=0;i<height.length;i++)
        {
            amt=amt+(Math.min(left[i],right[i])-height[i]);
        }
        return amt;
    }
}
