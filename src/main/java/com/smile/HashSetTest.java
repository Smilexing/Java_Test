package com.smile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/13 17:13
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("set1 size: " + set1.size());

        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("set2 add(4): " + set2.add(4));
        System.out.println("set2 add(3): " + set2.add(3));

        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("set3 remove(1): " + set3.remove(1));
        System.out.println("set3 remove(4): " + set3.remove(4));

        Set<Integer> set4 = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("set4 contains(2): " + set4.contains(2));
        System.out.println("set4 contains(4): " + set4.contains(4));

        Set<Integer> set5 = new HashSet<>(Arrays.asList(1, 2, 3));
        set5.clear();
        System.out.println("set5 isEmpty: " + set5.isEmpty());
    }
}
