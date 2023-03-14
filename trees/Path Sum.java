/*Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children. */




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    boolean check=false;
    public void findSum(TreeNode root,int target,int val)
    {
        if(root==null)
        return;
        
        val=val+root.val;

        if(root.left==null&&root.right==null)
        {
            if(target==val)
            {
            check=true;
            }
        }

        findSum(root.left,target,val);
        findSum(root.right,target,val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        findSum(root,targetSum,0);
        return check;
    }
}
