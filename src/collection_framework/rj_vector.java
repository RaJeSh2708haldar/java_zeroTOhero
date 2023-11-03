package collection_framework;

import java.util.Vector;

public class rj_vector {
    public static void main(String[] args) {
        Vector <Integer> v1= new Vector<>();
        v1.add(6);
        v1.add(3);
        v1.add(1);

        for(int i=0;i<v1.size();i++){
            System.out.print(v1.get(i));
            System.out.print(", ");
        }
    }
}
