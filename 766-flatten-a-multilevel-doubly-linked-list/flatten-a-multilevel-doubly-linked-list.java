/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
          if (head == null) {
            return null;
        }
        Node current=head;
         while (current != null) {

            if (current.child != null) {

                Node next = current.next;

                Node child = flatten(current.child);

                current.next = child;
                child.prev = current;

                current.child = null;

                Node tail = child;

                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = next;

                if (next != null) {
                    next.prev = tail;
                }
            }

            current = current.next;
        }

        return head;
    }
}