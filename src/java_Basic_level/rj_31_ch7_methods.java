package java_Basic_level;

public class rj_31_ch7_methods {
     int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*3;
        }
        return z;
    }


    public static void main(String[] args) {
         int a=4;
         int b=3;
         int c;
        //c=logic(a,b);  //static is running
        rj_31_ch7_methods obj = new rj_31_ch7_methods(); // not static
        c= obj.logic(a,b);
        System.out.println(c);
       /* int a1=4;
        int b1=13;
         int c1;
        c1=logic(a1,b1);
       // c1 = obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);*/
    }
}
