package java_Basic_level;

public class rj_recursion {
    static void serialNum(int a){
      if(a==15){
          return;
      }
        System.out.println(a);
      serialNum(a+1);
    }
    static void recur(int x){
        if(x>0){
            for(int i=x;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            recur(x-1);
        }
    }
    public static void main(String[] args) {
          int x=0;
       serialNum(x);

       recur(4);

    }
}
