package com.prakash.leetcode.easy;

public class ConvertBinaryNumberInLinkedListToInteger {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode p = head;
        int total = 0;
        while (p != null) {
            // Validate that the value is a valid binary digit (0 or 1)
            if (p.val != 0 && p.val != 1) {
                throw new IllegalArgumentException("Invalid binary digit: " + p.val + ". Only 0 and 1 are allowed.");
            }
            total = total * 2 + p.val;
            p = p.next;
        }
        return total;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 1 -> 0 -> 0 -> 1 (binary 11001 = 25)
        ListNode node5 = new ListNode(1);
        ListNode node4 = new ListNode(0, node5);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head = new ListNode(1, node2);

        ConvertBinaryNumberInLinkedListToInteger solution = new ConvertBinaryNumberInLinkedListToInteger();
        int result = solution.getDecimalValue(head);

        System.out.println("Binary 11001 in decimal is: " + result);
        System.out.println("Expected: 25");
    }
}
