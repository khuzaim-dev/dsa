package linked_lists.optimal;

/*
Problem: Remove Duplicates from Sorted List

Optimal Approach:
Traverse the list once and
skip duplicate nodes.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RemoveDuplicatesFromSortedListOptimal {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }

        return head;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        head = deleteDuplicates(head);

        printList(head);
    }
}