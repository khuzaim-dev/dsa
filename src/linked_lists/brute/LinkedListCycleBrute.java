package linked_lists.brute;

import java.util.HashSet;

/*
Problem: Linked List Cycle

Brute Force Approach:
Store visited nodes in a HashSet.
If a node is visited again,
a cycle exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class LinkedListCycleBrute {

    public static boolean hasCycle(ListNode head) {

        HashSet<ListNode> visited = new HashSet<>();

        while (head != null) {

            if (visited.contains(head)) {
                return true;
            }

            visited.add(head);
            head = head.next;
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