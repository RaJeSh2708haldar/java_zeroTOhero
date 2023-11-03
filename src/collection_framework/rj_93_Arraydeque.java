package collection_framework;

import java.util.ArrayDeque;

public class rj_93_Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ArrayDeque<Integer> ad2=new ArrayDeque<>();
        ad2.add(23);
        ad2.add(25);
        ad2.add(29);


        ad1.add(8);
        ad1.add(5);
        ad1.add(3);
        ad1.add(7);
        ad1.add(2);
        ad1.addFirst(4);
        ad1.remove(7);
        ad1.addAll(ad2);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);



    }
}
