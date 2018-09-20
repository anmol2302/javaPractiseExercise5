import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateArraylistTest {
UpdateArraylist ob=null;
    @Before
    public void setUp() throws Exception {

    ob=new UpdateArraylist();

    }

    @After
    public void tearDown() throws Exception {
    ob=null;}


    @Test
    public void validateArraylist(){

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("mango");
        fruits.add("banana");
        assertEquals(Arrays.asList("orange","kiwi","mango","banana"),ob.updateArraylist(fruits,"apple","orange"));

        ArrayList<String> fruitstest1=new ArrayList<>();
        fruitstest1.add("apple");
        fruitstest1.add("kiwi");
        fruitstest1.add("mango");
        fruitstest1.add("banana");


        assertEquals(Arrays.asList("apple","orange","mango","banana"),ob.updateArraylist(fruitstest1,"kiwi","orange"));



    }
}