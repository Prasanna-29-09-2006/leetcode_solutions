/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /* this approach uses HashSet but not two pointer pattern ;
            T.C = o(n+m) ; S.C = o(n)[as we use the HashSet]
         */
        ListNode temp=headA;
        Set<ListNode> set = new HashSet<>();
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(set.contains(temp)) return temp;
            temp=temp.next;
        }
        return null;

        
    }
}