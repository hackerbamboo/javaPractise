/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)    return null;
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        
        return sortedListToBST(head, 0, n-1);
    }
    
    //To be honest, I don't quite get this method........
    //Sigh.....
    public TreeNode sortedListToBST(ListNode head, int start, int end){
        if(start>end) return null;
        int mid = (end+start)/2;
        TreeNode leftchild = sortedListToBST(head, start, mid-1);
        TreeNode parent = new TreeNode(head.val);
        parent.left = leftchild;
        if(head.next != null){     //You can not use head=head.next. Because the outside function the head doesn't change. By using this method, you manualy force the outside head advances. 
            head.val = head.next.val;
            head.next = head.next.next;
        }
        parent.right = sortedListToBST(head, mid+1, end);
        return parent;
    }
    
}