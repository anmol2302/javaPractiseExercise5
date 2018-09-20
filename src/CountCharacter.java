import java.util.HashMap;

public class CountCharacter {


    public HashMap<String, Integer> countChar(Object sentence) {
        HashMap<String, Integer> mapOccurence = new HashMap<>();
        try {
            if (sentence instanceof String) {

                if (((String) sentence).length() != 0) {


                    String[] indivChar = ((String) sentence).split("[^a-zA-Z]+");


                    for (int i = 0; i < indivChar.length; i++) {

                        if (mapOccurence.containsKey(indivChar[i])) {

                            mapOccurence.replace(indivChar[i], mapOccurence.get(indivChar[i]), mapOccurence.get(indivChar[i])+1);
                        } else {
                            mapOccurence.put(indivChar[i], 1);
                        }

                    }
                    return mapOccurence;

                } else {

                    return null;
                }


            } else {
                throw new Exception("invalid input");
            }
        } catch (Exception e) {
            return null;
        }


    }


}
