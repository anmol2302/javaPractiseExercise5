import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class SortedSetTest {
SortedSet ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new SortedSet();
    }

    @After
    public void tearDown() throws Exception {

    ob=null;
    }

    @Test
    public void sortSet() {

        ArrayList<String> testList=new ArrayList<>();
        HashSet<String> setTest=new HashSet<>();
        testList.add("Alice");
        testList.add("Bluto");
        testList.add("Eugane");
        testList.add("Harry");
        testList.add("Olive");
        setTest.add("Bluto");
        setTest.add("Eugane");
        setTest.add("Alice");
        setTest.add("Olive");
        setTest.add("Harry");



assertEquals(testList,ob.sortSet(setTest));

    }
}