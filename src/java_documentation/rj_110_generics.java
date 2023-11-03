package java_documentation;

import java.util.ArrayList;
import java.util.Scanner;

class mygrt<t1,t2>{
    int vul=344;
    private t1 T1;
    private t2 T2;

    public t2 getT2() {
        return T2;
    }

    public void setT2(t2 t2) {
        T2 = t2;
    }

    public void setVul(int vul) {
        this.vul = vul;
    }

    public void setT1(t1 t1) {
        T1 = t1;
    }

    public int getVul() {
        return vul;
    }

    public t1 getT1() {
        return T1;
    }

    public mygrt(int vul, t1 T1 ,t2 T2){
        this.vul=vul;
        this.T1=T1;
        this.T2=T2;
    }
}
public class rj_110_generics {
    public static void main(String[] args) {
       // ArrayList arrayList=new ArrayList();
        ArrayList <Integer>arrayList=new ArrayList();
        //arrayList.add("str1");
        arrayList.add(76);
        arrayList.add(890);
       // arrayList.add(new Scanner(System.in));
        int rj=arrayList.get(1);
       // int rj=(int) arrayList.get(2);
        System.out.println(rj);

        //mygrt <Integer>g1=new mygrt(3,"mystring is string");
        mygrt <String,Integer>g2=new mygrt(4,"mystring is string",5);
        //int r=g1.getVul();
        int r=g2.getVul();
        String str=g2.getT1();
        int t=g2.getT2();
        //System.out.println(r);
        System.out.println(str);
        System.out.println(r);
        System.out.println(t);
    }
}
