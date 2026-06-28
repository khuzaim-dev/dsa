package linked_lists.brute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Problem: Merge Two Sorted Lists

Brute Force Approach:
Store all elements in a list,
sort the list, then rebuild
the linked list.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

public class MergeTwoSortedListsBrute {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> values = new ArrayList<>();

        while (list1 != null) {
            values.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            values.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(values);

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

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode merged = mergeTwoLists(list1, list2);

        printList(merged);
    }
}
