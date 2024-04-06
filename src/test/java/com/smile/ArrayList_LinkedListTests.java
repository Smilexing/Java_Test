package com.smile;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/5 20:02
 */
public class ArrayList_LinkedListTests {
//    比较 ArrayList 和 LinkedList 在插入和获取元素时的性能差异
    @Test
    public void arrTest() {
        int size = 100_0000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

//        ArrayList 在插入元素时的性能优于 LinkedList
//        ArrayList 的底层数据结构是基于数组，插入元素时只需将元素添加到数组末尾，
//        而 LinkedList 的底层数据结构是基于链表，插入元素时需要维护节点关系，耗时较长
        add(size, arrayList, "arrayList");


//        ArrayList 可以通过索引直接访问元素，效率较高，
//        而 LinkedList 需要遍历链表来获取元素，耗时较长

        /**
         * void linkLast(E e) {
         *         final Node<E> l = last;
         *         final Node<E> newNode = new Node<>(l, e, null);
         *         last = newNode;
         *         if (l == null)
         *             first = newNode;
         *         else
         *             l.next = newNode;
         *         size++;
         *         modCount++;
         *     }
         */
        add(size, linkedList, "linkedList");
        /**
         * 输出结果
         * arrayList插入元素时间 52
         * linkedList插入元素时间 86
         */


        get(size, arrayList, "arrayList");
        /**
         * Node<E> node(int index) {
         *         // assert isElementIndex(index);
         *
         *         if (index < (size >> 1)) {
         *             Node<E> x = first;
         *             for (int i = 0; i < index; i++)
         *                 x = x.next;
         *             return x;
         *         } else {
         *             Node<E> x = last;
         *             for (int i = size - 1; i > index; i--)
         *                 x = x.prev;
         *             return x;
         *         }
         *     }
         */
        get(size, linkedList, "linkedList");
    }


    private void get(int size, List<Integer> list, String arrType) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(arrType + "获取元素时间 " + (end - start));
    }

    private void add(int size, List<Integer> list, String arrType) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(arrType + "插入元素时间 " + (end - start));
    }
}
