public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null ){
            return res;
        }
        else if(root.left ==  null && root.right == null){
            res.add(root.val);
        }
        else{
            if(root.left != null)
                res.addAll(inorderTraversal(root.left));
            res.add(root.val);
            if(root.right != null)
                res.addAll(inorderTraversal(root.right));
        }
        return res;
    }
}
