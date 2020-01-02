package leetcode.tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SameTree{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return (p == null && q== null) || (p!=null && q!=null && p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}