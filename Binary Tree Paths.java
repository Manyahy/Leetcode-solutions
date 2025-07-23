/*257. Binary Tree Paths
Solved
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

 

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]*/
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
/*Diagrammmmmmmmmm
 Start → dfs(1, "")
        |
        |-- dfs(2, "1")
        |     |
        |     |-- dfs(null, "1->2") → return
        |     |
        |     |-- dfs(5, "1->2") → Leaf → Add "1->2->5"
        |           → return to dfs(2)
        |     → return to dfs(1)
        |
        |-- dfs(3, "1") → Leaf → Add "1->3"
              → return to dfs(1)

End: result = ["1->2->5", "1->3"]*/

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        // Build path
        if (path.length() > 0) {
            path += "->";
        }
        path += node.val;

        // If leaf, add to result
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        // Recurse left and right
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
}
