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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
              ListNode current=head;
          int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int skip=count-n;
        if(skip==0){
            return head.next;
        }
        while(skip>1){
            current=current.next;
            skip--;
        }
        current.next=current.next.next;
        return head;
    }
}