public class BinarySearchTree {
    TreeNode root;
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    BinarySearchTree()
    {
        root = null;
    }
    public void insert(int data){
        root = insertNode(root, data);
    }
    public TreeNode insertNode(TreeNode root,int data){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }
        if(data < root.val) root.left = insertNode(root.left, data);
        if(data > root.val) root.right = insertNode(root.right, data);
        return root;
    }

}
