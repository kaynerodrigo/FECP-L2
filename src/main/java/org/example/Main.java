package org.example;

// ===================== PROBLEM 2: EASY-MEDIUM LEVEL =====================
/**
 * PROBLEM 2: Remove Duplicates
 *
 * DESCRIPTION:
 * Write a method that removes duplicate elements from a list while preserving
 * the original order of first occurrences.
 *
 * REQUIREMENTS:
 * - Preserve the order of elements (first occurrence stays)
 * - Remove all subsequent duplicates
 * - Handle null input gracefully (return empty list)
 * - Return a new list (don't modify the original)
 *
 * EXAMPLE:
 * Input: [1, 2, 2, 3, 4, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 *
 * Input: [5, 5, 5, 5]
 * Output: [5]
 */
import java.util.*;

public class Main {

    public static ArrayList<Integer> removeDuplicates(List<Integer> num) throws NullPointerException {
        if (num == null) {
            ArrayList<Integer> distinctNumList = new ArrayList<>();
            return distinctNumList;
        }
        else {
            Set<Integer> distinctNum = new HashSet<>(num);
            ArrayList<Integer> distinctNumList = new ArrayList<>(distinctNum);
            return distinctNumList;
        }
    }

    public static void main(String[] args) {
//        Integer[] check = {5, 5, 5, 6};
//        List check2 = new ArrayList<>(Arrays.asList(check));
//
//        System.out.println(check2);
        Integer[] numberArrays = {5, 5, 5, 5};
        List<Integer> num = new ArrayList<>(Arrays.asList(numberArrays));

        try {
            List<Integer> num2 = new ArrayList<>(removeDuplicates(null));
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        //System.out.println(num2);
    }
}