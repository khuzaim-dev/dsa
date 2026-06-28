package linked_lists.brute;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Remove Duplicates from Sorted List

Brute Force Approach:
Copy unique values into a list,
then rebuild the linked list.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class RemoveDuplicatesFromSortedListBrute {

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        List<Integer> values = new ArrayList<>();

        while (head != null) {

            if (values.isEmpty() || values.get(values.size() - 1) != head.val) {
                values.add(head.val);
            }

            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
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