// ============================================================
// Problem    : 701. Insert into a Binary Search Tree
// Difficulty : Medium
// URL        : https://leetcode.com/problems/insert-into-a-binary-search-tree/
// Language   : Java
// Date       : 2026-06-06
// ============================================================
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) root=new TreeNode(val);
        else if(val<root.val)
            root.left=insertIntoBST(root.left,val);
        else if(val>root.val)
            root.right=insertIntoBST(root.right,val);
        
        return root;
    }
}