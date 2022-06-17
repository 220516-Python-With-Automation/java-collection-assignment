# Instructions
This assignment will be looking at collections in Java and how they are created and sorted. The focus is on generation and implementing your own sorting algorithms for the various types of collections. The same code will not be useful for another collection as their implementation will be different. This is also used in tandem with TestNG to continue gaining experience with Java and TestNG.

To run the tests, you can use this command.

```
mvn verify
```

And this will run the tests within the test folder. Make sure to run this command when you are in the same folder that contains your pom.xml otherwise the `mvn` command will not know how to run anything.

TestNG using xml files within the test resources folder that is used to organize your tests. The tests themselves are coded within the test folder too.

1. Read through the project files and make sure you understand what everything is before using it
2. Run the command `mvn verify` in a terminal and make sure the failure is due to failed tests and not a build error
3. Go to the `com.revature.generators` and `com.revature.sorters` to see the classes you must finish implementing
   1. There is an interface that is inherited by each class that show which methods that must be made

## Hints
Algorithms are important for sorting and for programming in general but this assignment is not focused on it. While it is good programming experience for future work, you do not have to implement a new algorithm for each sorting method.

Here are some resources:

[Java Collections](https://www.geeksforgeeks.org/collections-in-java-2/)

[TestNG Docs](https://testng.org/doc/)
