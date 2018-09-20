import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.format.TextStyle;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountCharacterTest {
CountCharacter ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new CountCharacter();

    }
    @After
    public void tearDown() throws Exception {
    ob=null;
    }

    @Test
    public void countChar() {

        String str = "one one -one___two,,three,one @three*one?two";
        HashMap<String,Integer>testMap=new HashMap<>();

        testMap.put("one",5);
        testMap.put("two",2);
        testMap.put("three",2);
Integer testValue=1234567;
        assertEquals(testMap,ob.countChar(str));
        assertEquals(null,ob.countChar(testValue));

    }
}