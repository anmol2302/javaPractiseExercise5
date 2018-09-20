import java.util.*;
class MainTest{
    public static void main(String args[]){
        ArrayList<Students> al=new ArrayList<Students>();
        al.add(new Students(101,"Vijay",23));
        al.add(new Students(106,"Ajay",27));
        al.add(new Students(105,"Jai",21));
        al.add(new Students(107,"Jai",21));

        System.out.println("Sorting by Name...");
        Collections.sort(al,new StudentSorter());
        for(Students st: al){
            System.out.println(st.id+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al,new StudentSorter());
        for(Students st: al){
            System.out.println(st.id+" "+st.name+" "+st.age);
        }

    }
}