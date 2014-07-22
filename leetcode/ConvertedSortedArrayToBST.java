/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 *  Testing Testing....
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0){
            return null;
        }
        
       
        return sortedArrayToBST(num, 0, num.length-1);
        
        
        
    }
    
    public TreeNode sortedArrayToBST(int[] sum, int left, int right){
        if (left > right ){
            return null;
        }
            int middleindex = (right - left)/2 + left; 
            TreeNode head = new TreeNode(sum[middleindex]);
        
            head.left = sortedArrayToBST(sum, left, middleindex-1);
            head.right = sortedArrayToBST(sum, middleindex+1, right);
            
            return head;
    
        
    }
}