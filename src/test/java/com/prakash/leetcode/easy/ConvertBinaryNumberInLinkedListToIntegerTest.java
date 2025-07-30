package com.prakash.leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertBinaryNumberInLinkedListToIntegerTest {
    private final ConvertBinaryNumberInLinkedListToInteger solution = new ConvertBinaryNumberInLinkedListToInteger();

    private ConvertBinaryNumberInLinkedListToInteger.ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ConvertBinaryNumberInLinkedListToInteger.ListNode dummy = new ConvertBinaryNumberInLinkedListToInteger.ListNode();
        ConvertBinaryNumberInLinkedListToInteger.ListNode current = dummy;
        for (int val : values) {
            current.next = new ConvertBinaryNumberInLinkedListToInteger.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    @Test
    void testGetDecimalValue() {
        // Test case 1: Single node with value 1
        assertEquals(1, solution.getDecimalValue(createLinkedList(new int[]{1})));
        
        // Test case 2: Single node with value 0
        assertEquals(0, solution.getDecimalValue(createLinkedList(new int[]{0})));
        
        // Test case 3: Multiple nodes - 1 -> 0 -> 1
        assertEquals(5, solution.getDecimalValue(createLinkedList(new int[]{1, 0, 1})));
        
        // Test case 4: Multiple nodes - 1 -> 0 -> 0 -> 1 -> 0 -> 0 -> 1 -> 1 -> 1 -> 0 -> 0 -> 0 -> 0 -> 0 -> 0
        assertEquals(18880, solution.getDecimalValue(createLinkedList(
            new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0})));
        
        // Test case 5: All ones - 1 -> 1 -> 1 -> 1 -> 1
        assertEquals(31, solution.getDecimalValue(createLinkedList(new int[]{1, 1, 1, 1, 1})));
        
        // Test case 6: All zeros - 0 -> 0 -> 0 -> 0 -> 0
        assertEquals(0, solution.getDecimalValue(createLinkedList(new int[]{0, 0, 0, 0, 0})));
        
        // Test case 7: Leading zeros - 0 -> 0 -> 1 -> 0 -> 1
        assertEquals(5, solution.getDecimalValue(createLinkedList(new int[]{0, 0, 1, 0, 1})));
    }

    @Test
    void testGetDecimalValueWithInvalidInput() {
        // Test case 8: Null input
        assertEquals(0, solution.getDecimalValue(null));
        
        // Test case 9: Invalid binary digit (2)
        assertThrows(IllegalArgumentException.class, () -> 
            solution.getDecimalValue(createLinkedList(new int[]{1, 2, 1})));
            
        // Test case 10: Invalid binary digit (-1)
        assertThrows(IllegalArgumentException.class, () -> 
            solution.getDecimalValue(createLinkedList(new int[]{1, -1, 1})));
    }
}
