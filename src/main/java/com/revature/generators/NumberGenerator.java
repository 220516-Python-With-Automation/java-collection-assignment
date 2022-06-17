package com.revature.generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import java.util.Random;

public class NumberGenerator implements Generator{

    // Implement the null methods

    public ArrayList<Object> generateArrayList(int length) {
        Random rand = new Random();
        ArrayList<Object> numbers = new ArrayList<Object>();
        for (int i = 0; i < length; i++) {
            numbers.add(rand.nextInt(1000));
        }
        return numbers;
    }

    public LinkedList<Object> generateLinkedList(int length) {
        // TODO Auto-generated method stub
        return null;
    }

    public Queue<Object> generateQueue(int length) {
        // TODO Auto-generated method stub
        return null;
    }

    public HashMap<Integer, Object> generateHashMap(int length) {
        // TODO Auto-generated method stub
        return null;
    }

}
