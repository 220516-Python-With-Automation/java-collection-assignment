package com.revature;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.revature.generators.NumberGenerator;
import com.revature.sorters.NumberSorter;

public class NumberSorterTest {

    private NumberGenerator numberGenerator = new NumberGenerator();

    private NumberSorter numberSorter = new NumberSorter();

    private List<Object> numbersArrayList = numberGenerator.generateArrayList(10);



    @Test(groups = {"list-sorter-test"})
    public void testListSorter(){
        // This test is made to validate that a list has been sorted
        // The list sorter works for both array and linked list

        numberSorter.sortCollection(numbersArrayList, numbersArrayList.size());


        // We use a cast as the collection is of type object so cannot be compared like so
        Assert.assertTrue((Integer) numbersArrayList.get(0) < (Integer) numbersArrayList.get(1));

    }


    // Implement the same test for the other collection types

    @Test(groups = {"queue-sorter-test"})
    public void testQueueSorter(){
        Assert.assertNotNull(null);
    }

    @Test(groups = {"hashmap-sorter-test"})
    public void testHashMapSorter(){
        Assert.assertNotNull(null);
    }

    @Test(groups = {"list-min-test"})
    public void testListMinFinder(){
        int min = (Integer) numberSorter.findMin(numbersArrayList);
        Assert.assertTrue(min <= (Integer) numbersArrayList.get(2));
    }

    @Test(groups = {"list-max-test"})
    public void testListMaxFinder(){
        int max = (Integer) numberSorter.findMax(numbersArrayList);
        Assert.assertTrue(max >= (Integer) numbersArrayList.get(numbersArrayList.size() - 1));
    }

    @Test(groups = {"queue-min-test"})
    public void testQueueMinFinder(){
        Assert.assertNotNull(null);
    }

    @Test(groups = {"queue-max-test"})
    public void testQueueMaxFinder(){
        Assert.assertNotNull(null);
    }
    @Test(groups = {"hashmap-min-test"})
    public void testHashMapMinFinder(){
        Assert.assertNotNull(null);
    }

    @Test(groups = {"list-max-test"})
    public void testHashMapMaxFinder(){
        Assert.assertNotNull(null);
    }
}
