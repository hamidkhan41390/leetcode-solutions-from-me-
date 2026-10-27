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
           int lenA = 0;
        int lenB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        if (lenA > lenB) {
            int diff = lenA - lenB;

            while (diff > 0) {
                pA = pA.next;
                diff--;
            }
        } else {
            int diff = lenB - lenA;

            while (diff > 0) {
                pB = pB.next;
                diff--;
            }
        }

        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;
        }

        return pA;
    }
}