import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ReplaceWordTest {
ReplaceWord ob=null;
    @Before
    public void setUp() throws Exception {

        ob=new ReplaceWord();
    }

    @After
    public void tearDown() throws Exception {

    ob=null;
    }

    @Test
    public void exchangeValues() {

        HashMap<String,String>testMap=new HashMap<>();
        testMap.put("val1","c++");
        testMap.put("val2","java");

        HashMap<String,String>sendtoTestMap=new HashMap<>();
        sendtoTestMap.put("val1","");
        sendtoTestMap.put("val2","c++");

        assertEquals(sendtoTestMap,ob.exchangeValues(testMap));



    }
}