package com.revature.generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public interface Generator {
    
    ArrayList<Object> generateArrayList(int length);

    LinkedList<Object> generateLinkedList(int length);
    
    Queue<Object> generateQueue(int length);

    HashMap<Integer, Object> generateHashMap(int length);
}
