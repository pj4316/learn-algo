class Solution {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if(root == null) return TreeNode(`val`)
        
        if(root.`val` < `val`) {
            root.right = if(root.right == null) {
                TreeNode(`val`)
            } else {
                insertIntoBST(root.right, `val`);
            } 
        } else {
            root.left = if(root.left == null) {
                TreeNode(`val`)
            } else {
                insertIntoBST(root.left, `val`);
            }
        }
        
        return root;
    }
}
