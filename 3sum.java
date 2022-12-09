//O(n^3) solution
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest=13001,sum=0,result=0;
       for(int i=0;i<nums.length-2;i++)
       {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    sum=nums[i]+nums[j]+nums[k];
                    int diff=0;
                    if(sum<target)
                    diff=target-sum;
                    else
                    diff=sum-target;
                    if(diff<closest)
                    {
                    result=sum;
                    closest=diff;
                    }
                }
            }
       } 
       return result;
    }
}

// O(n^2) solution
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-res))
                {
                    res=sum;
                }
                if(res==target)
                return res;
                if(sum<target)
                j++;
                else
                k--;
            }
        }
        return res;
    }
}
