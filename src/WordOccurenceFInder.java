import java.util.HashMap;
import java.util.Map;

public class WordOccurenceFInder {


public Map<String,Boolean> findOccurence(String[] str){

    Map<String,Integer> wordCounter=new HashMap<>();

    for(int i=0;i<str.length;i++){

        if(wordCounter.containsKey(str[i])){

            wordCounter.replace(str[i],wordCounter.get(str[i]),wordCounter.get(str[i])+1);
        }
        else{
            wordCounter.put(str[i],1);
        }

    }
    Map<String,Boolean> returnMap=new HashMap<>();


    for(Map.Entry<String,Integer>mp:wordCounter.entrySet()){


        if(mp.getValue()>=2){
            returnMap.put(mp.getKey(),true);
        }
        else{
            returnMap.put(mp.getKey(),false);
        }




    }

    return returnMap;


}

    public static void main(String[] args) {

    WordOccurenceFInder ob=new WordOccurenceFInder();

        String arr[] = {"a","b","a","c","d","b","c"};
        Map<String,Boolean>mp=ob.findOccurence(arr);

        for(Map.Entry<String,Boolean>mop:mp.entrySet())
        {

            System.out.println(mop.getKey()+","+mop.getValue());



        }


    }








}
