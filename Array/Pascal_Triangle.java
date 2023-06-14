class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal=new ArrayList<>();
        List<Integer> prev=new ArrayList<>();

        prev.add(1);
        pascal.add(prev);
        for(int i=2;i<=numRows;i++)
        {
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=0;j<prev.size()-1;j++)
            {
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            pascal.add(curr);
            prev=curr;
        }
        return pascal;
    }
}