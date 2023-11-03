package collection_framework;
import java.util.LinkedList;
public class rj_92_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> la1=new LinkedList<>();
        LinkedList<Integer> la2=new LinkedList<>();
        la2.add(34);
        la2.add(31);
        la2.add(38);

        la1.add(5);
        la1.add(8);
        la1.add(2);
        la1.add(0,7);
        la1.add(0,3);
        la1.addAll(0, la2);
        System.out.println(la1.contains(56));
        System.out.println(la1.indexOf(5));
        System.out.println(la1.lastIndexOf(8));
        la1.set(2,456);
        //la1.clear();

        //new linkedlist but not arraylist
        la1.addLast(980);
        la1.addFirst(657);


        for(int i=0;i<la1.size();i++){
            System.out.print(la1.get(i));
            System.out.print(", ");
        }
    }
}
