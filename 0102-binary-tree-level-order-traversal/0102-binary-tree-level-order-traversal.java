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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
         if  (root == null) {
            return res;
        }
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        while(!level.isEmpty()) {
            int length = level.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode curr = level.poll();
                levelList.add(curr.val);
                if (curr.left != null) {
                    level.offer(curr.left);
                }
                if (curr.right != null) {
                    level.offer(curr.right);
                }
            }

            res.add(levelList);
        }
        return res;
    }
}