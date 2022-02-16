class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        if(root == null) return false;
        
        var result = true;
        if(root.left != null) {
            result = result && root.`val` > max(root.left) && isValidBST(root.left)
        }
        
        if(root.right != null) {
            result = result && root.`val` < min(root.right) && isValidBST(root.right)
        }
        
        return result;
    }
    
    fun min(root: TreeNode?): Int {
        if(root == null) return 0;
        var result = root.`val`;
        if(root.left != null) result = Math.min(result, min(root.left));
        if(root.right != null) result =  Math.min(result, min(root.right));
        
        return result;
    }
    
    fun max(root: TreeNode?): Int {
        if(root == null) return 0;
        var result = root.`val`;
        if(root.left != null) result = Math.max(result, max(root.left));
        if(root.right != null) result =  Math.max(result, max(root.right));
        
        return result;
    }
}
