package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.Main.removeDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testRemoveDuplicates() {
        // Test case 1: List with duplicates
        List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected1, removeDuplicates(numbers1));

        // Test case 2: No duplicates
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected2, removeDuplicates(numbers2));

        // Test case 3: All duplicates
        List<Integer> numbers3 = Arrays.asList(5, 5, 5, 5);
        List<Integer> expected3 = Arrays.asList(5);
        assertEquals(expected3, removeDuplicates(numbers3));

        // Test case 4: Empty list
        assertEquals(new ArrayList<>(), removeDuplicates(new ArrayList<>()));

        // Test case 5: Null list
        assertEquals(new ArrayList<>(), removeDuplicates(null));
    }
}