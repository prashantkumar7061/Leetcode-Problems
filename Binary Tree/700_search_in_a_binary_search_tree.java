// ============================================================
// Problem    : 700. Search in a Binary Search Tree
// Difficulty : Easy
// URL        : https://leetcode.com/problems/search-in-a-binary-search-tree/
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val ==val){
             
             return root;
        }

        else if(val<root.val) return searchBST(root.left, val);
        else if (val>root.val)  return searchBST(root.right, val);

        return root;
    }
}