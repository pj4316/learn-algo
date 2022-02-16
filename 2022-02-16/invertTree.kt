class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root == null) return root;

        val left = root.left;
        val right = root.right;
        
        root.left = invertTree(right);
        root.right = invertTree(left);
        
        return root;
    }
}
