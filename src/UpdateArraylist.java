import java.util.ArrayList;

public class UpdateArraylist {


    public ArrayList<String> updateArraylist(ArrayList<String> fruits,Object replaceWhom,Object replaceWith) {
        try {
            if (fruits.get(0) instanceof String && replaceWhom instanceof String && replaceWith instanceof String) {

                for (int i = 0; i < fruits.size(); i++) {

                    if(fruits.get(i).equalsIgnoreCase(replaceWhom.toString())){
                        fruits.set(i,replaceWith.toString());
                    }

                }

            } else {

                throw new Exception("invalid input");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return fruits;
        }
return fruits;
    }

}
