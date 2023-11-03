package java_Basic_level;

public class  rj_33_ch7_varargs {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum (int a, int b, int c){
        return a+b+c;
    }
    static int sum (int a, int b, int c, int d){
        return a+b+c+d;
    }



    //sum
    static int sum(int ... rolex){
        int result=0;
        for(int a:rolex){
            result+=a;
        }
        return result;
    }

    static int multi(int ... arr){
        int result=1;
        for(int e:arr){
            result *= e;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The Sum of 5 and 5 is: "+sum(5,5));
        System.out.println("the sum is: "+sum(2,5,7));
        System.out.println("the four number of sum: "+sum(3,9,6,4));
        System.out.println("the sum result: "+sum(5,7,8,6,4,3,1));
        System.out.println("the multi result: "+ multi(5,8,5,2));
    }
}
