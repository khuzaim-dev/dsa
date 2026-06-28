package linked_lists.optimal;

/*
Problem: Linked List Cycle

Optimal Approach:
Use Floyd's Cycle Detection Algorithm
(Fast and Slow Pointers).

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LinkedListCycleOptimal {

    public static boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}
