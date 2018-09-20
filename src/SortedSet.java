import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SortedSet {


    public ArrayList<String>sortSet(HashSet<String> setObject){
        TreeSet<String>sortedSetObject=new TreeSet<>();
        ArrayList<String> listObect=new ArrayList<>();
        listObect.addAll(setObject);
        Collections.sort(listObect);
        sortedSetObject.addAll(setObject);
        for(String str:sortedSetObject){
            System.out.print("Output from set "+str+"\t");
        }
        return listObect;
    }


}
