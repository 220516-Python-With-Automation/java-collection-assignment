package com.revature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.revature.generators.NumberGenerator;

public class NumberGeneratorTest {

    private NumberGenerator numberGenerator = new NumberGenerator();

    @Test(groups = { "arraylist-generator-test"})
    public void testValidArrayListGeneration(){
        ArrayList<Object> numbers = numberGenerator.generateArrayList(5);

        for(int i = 0; i < numbers.size(); i++){
            Assert.assertEquals(numbers.get(i).getClass(), Integer.class);
        }
    }

    @Test(groups = { "linkedlist-generator-test"})
    public void testValidLinkedListGeneration(){
        LinkedList<Object> numbers = numberGenerator.generateLinkedList(5);

        // Create an assert to check every item in the collection is the correct data type
        Assert.assertNotNull(null);
    }

    @Test(groups = { "queue-generator-test"})
    public void testValidNumberQueueGenerated(){
        Queue<Object> numbers = numberGenerator.generateQueue(5);

        // Create an assert to check every item in the collection is the correct data type
        Assert.assertNotNull(null);
    }

    @Test(groups = { "hashmap-generator-test"})
    public void testValidNumberHashMapGenerated(){
        HashMap<Integer, Object> numbers = numberGenerator.generateHashMap(5);

        // Create an assert to check every item in the collection is the correct data type
        Assert.assertNotNull(null);
    }
}
