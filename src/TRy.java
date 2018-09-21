import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class TRy{

    public static void main(String[] args) {

        Map<Integer,String> hm=new HashMap<>();
        hm.put(11,"a");
        Collections.unmodifiableMap(hm);

        hm.put(12,"b");
        System.out.println(hm);



    }



}