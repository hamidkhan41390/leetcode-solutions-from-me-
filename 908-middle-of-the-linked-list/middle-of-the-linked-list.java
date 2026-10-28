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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count/2;
        while(count>0){
            head=head.next;
            count--;
        }
        return head;
    }
}