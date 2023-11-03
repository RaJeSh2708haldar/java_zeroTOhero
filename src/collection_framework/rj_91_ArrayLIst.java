package collection_framework;
import java.util.ArrayList;
public class rj_91_ArrayLIst {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>(5);
        a2.add(11);
        a2.add(14);
        a2.add(17);


        a1.add(2);
        a1.add(6);
        a1.add(3);
        a1.add(0,6);
        a1.add(0,9);
        a1.addAll(0,a2);


        System.out.println(a1.contains(32));
        System.out.println(a1.indexOf(6));
        System.out.println(a1.lastIndexOf(6));
        a1.set(1, 789);
        //a1.clear();
        for(int i=0;i<a1.size();i++){
            System.out.print(a1.get(i));
            System.out.print(", ");
        }


    }
}
