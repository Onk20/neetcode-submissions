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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        if(sameTree(root, subRoot)){
            return true;
        }

        return isSubtree(root.left, subRoot) || 
               isSubtree(root.right, subRoot);
    }

    public boolean sameTree(TreeNode root, TreeNode subRoot){

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(root);
        q2.add(subRoot);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode nodeP = q1.poll();
            TreeNode nodeQ = q2.poll();

            if(nodeP == null && nodeQ == null){
                continue;
            }

            if(nodeP == null || nodeQ == null || nodeP.val != nodeQ.val){
                return false;
            }

            q1.add(nodeP.left);
            q1.add(nodeP.right);
            q2.add(nodeQ.left);
            q2.add(nodeQ.right);
        }

        return true;


    }

    // public boolean sameTree(TreeNode p, TreeNode q) {
        
    //     Queue<TreeNode> q1 = new LinkedList<>();
    //     Queue<TreeNode> q2 = new LinkedList<>();

    //     q1.add(p);
    //     q2.add(q);

    //     while(!q1.isEmpty() && !q2.isEmpty()){
            
    //         TreeNode nodeP = q1.poll();
    //         TreeNode nodeQ = q2.poll();

    //         if(nodeP == null && nodeQ == null){
    //             continue;
    //         }

    //         if(nodeP == null || nodeQ == null || nodeP.val != nodeQ.val){
    //             return false;
    //         }

    //         q1.add(nodeP.left);
    //         q1.add(nodeP.right);
    //         q2.add(nodeQ.left);
    //         q2.add(nodeQ.right);


    //     }

    //     return true;
    // }
}
