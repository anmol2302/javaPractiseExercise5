import java.util.*;
class StudentSorter implements Comparator{
    public int compare(Object o1,Object o2){
        Students s1=(Students)o1;
        Students s2=(Students)o2;

        if(s1.name.equalsIgnoreCase(s2.name) && s1.age==s2.age){
            return s1.id-s2.id;
        }
        else if(s1.age==s2.age)
            return s1.name.compareTo(s2.name);
        else if(s1.age<s2.age)
            return 1;
        else
            return -1;
    }

}