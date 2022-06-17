package com.revature.sorters;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class NumberSorter implements Sorter{

    public void sortCollection(List<Object> collection, int length) {

        // This is a recursive bubble sort, we feed in the same object with a gradually reducing length
        // Once this length has reached 1, the collection has finished sorting
        if(length == 1){
            return;
        }

        // This loops through once and checks to see if the index you are on is greater
        // than the index one above
        // If it is then we swap and go to the next
        for (int i=0; i < length - 1; i++){
            if ((Integer) collection.get(i) > (Integer) collection.get(i + 1)){
                Object temp = collection.get(i);
                collection.set(i, collection.get(i + 1));
                collection.set(i + 1, temp);
            }
        }

        // This then runs through the whole collection 
        // Then we call it again but we can be sure that on the first pass through
        // the largest number will always go to the end so we shorten the length that
        // we pass through
        sortCollection(collection, length - 1);

    }

    // If you like you can use use the same recursive bubble algorithm or use your own
    // You will not be able to simply copy and paste as each collection type has it's own way of allowing
    // access to it's data

    public void sortCollection(Queue<Object> collection, int length) {
        // TODO Auto-generated method stub
    }

    public void sortCollection(HashMap<Integer, Object> collection, int length) {
        // TODO Auto-generated method stub
    }

    // These methods are used to find the maximum and minimum items in the collection
    public Object findMin(List<Object> collection) {

        Object temp = collection.get(0);
        for (int i=0; i < collection.size() - 1; i++){
            if((Integer) temp > (Integer) collection.get(i)){
                temp = collection.get(i);
            }
        }
        return temp;
    }

    public Object findMin(Queue<Object> collection) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object findMin(HashMap<Integer, Object> collection) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object findMax(List<Object> collection) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object findMax(Queue<Object> collection) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object findMax(HashMap<Integer, Object> collection) {
        // TODO Auto-generated method stub
        return null;
    }
    
}