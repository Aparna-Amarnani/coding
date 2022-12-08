class Solution {
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr,int i)
    {
        int j=arr.length-1;
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;    
        }
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i])
        i--;
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
}
