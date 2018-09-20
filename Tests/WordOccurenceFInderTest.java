import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordOccurenceFInderTest {


    WordOccurenceFInder ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new WordOccurenceFInder();
    }

    @After
    public void tearDown() throws Exception {

    ob=null;
    }


    @Test
    public void validateInput(){
        String arr[] = {"a","b","a","c","d","b","c"};
        Map<String,Boolean>testMap=new HashMap<>();
        testMap.put("a",true);
        testMap.put("b",true);
        testMap.put("c",true);
        testMap.put("d",false);

        assertEquals(testMap,ob.findOccurence(arr));








    }
}