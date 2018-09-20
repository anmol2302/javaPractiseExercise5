import java.util.HashMap;
import java.util.Map;

public class ReplaceWord {

    public HashMap<String,String> exchangeValues(HashMap<String,String> mapobject){

        String val1Value="";
        boolean foundVal1=false;
        boolean foundVal2=false;

        for(Map.Entry<String,String>mp:mapobject.entrySet()){
            if(mp.getKey().equalsIgnoreCase("val1")){
                val1Value=mp.getValue();
                mapobject.put(mp.getKey(),"");
                foundVal1=true;
            }

            else{
                foundVal1=false;
            }
        }



        for(Map.Entry<String,String>mp:mapobject.entrySet()){

            if(mp.getKey().equalsIgnoreCase("val2")){

                foundVal2=true;

                if(foundVal1 && foundVal2){
                mapobject.put(mp.getKey(),val1Value);}
            }
        }


        if(foundVal1 && foundVal2){return  mapobject;}

return null;

    }


}
