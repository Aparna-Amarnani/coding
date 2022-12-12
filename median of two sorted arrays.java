class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m=num1.length;
        int n=num2.length;
        int[] num=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(num1[i]<num2[j])
            {
                num[k]=num1[i];
                k++;
                i++;
            }
            else if(num1[i]==num2[j])
            {
                num[k++]=num1[i++];
                num[k++]=num2[j++];
            }
            else
            {
                num[k]=num2[j];
                k++;j++;
            }
        }
        while(i<m)
        {
            num[k]=num1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            num[k]=num2[j];
            k++;
            j++;
        }
        double median=0.0;
        if((m+n)%2==0)
        {
            median=(num[(m+n)/2-1]+num[(m+n)/2])/2.0;
        }
        else
        {
            median=num[(m+n)/2];
        }
        return median;
    }
}
