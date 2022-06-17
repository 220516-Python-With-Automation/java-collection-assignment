package com.revature.sorters;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public interface Sorter {

    void sortCollection(List<Object> collection, int length);

    void sortCollection(Queue<Object> collection, int length);

    void sortCollection(HashMap<Integer, Object> collection, int length);

    Object findMin(List<Object> collection);

    Object findMin(Queue<Object> collection);

    Object findMin(HashMap<Integer, Object> collection);

    Object findMax(List<Object> collection);

    Object findMax(Queue<Object> collection);

    Object findMax(HashMap<Integer, Object> collection);
}
