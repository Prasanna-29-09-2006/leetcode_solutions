/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head,prev=null,temp_ptr=null;
        while(temp!=null){
            temp_ptr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=temp_ptr;
        }
        return prev;
    }
}