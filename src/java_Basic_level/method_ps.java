package java_Basic_level;

public class method_ps {
    int rolex (int x,int y){
        return x+y;
    }

    static int mistu(int a,int b){
        return (a+b)/2;
    }

    static int rajesh(int v, int f){
        int u;
        if(v<f){
            u=(v+f)*7;
        }else{
            u=(v*f)/2;
        }
        return u;
    }

    static void foo(int a,int b){
        System.out.println("fuck off "+a+"you are ready "+b+"and fuck off");
    }

    static void foo(int a){
        System.out.println("lawra bhancohd "+a+"fuck off");
    }

    static void change (int [] arr){
        arr[3]=126;

    }

    static int mysum(int a,int b){
        return a*b;
    }

    static int sum(int ... raj){
        int result=0;
        for(int a:raj){
            result+=a;
        }
        return result;
    }


    public static void main(String[] args) {
        int z;
        method_ps obj=new method_ps();
        z = obj.rolex(4,8);
        System.out.println("the not static only object: "+z);


        int a=5;
        int b=9;
        int c;
        c=mistu(a,b);
        System.out.println("the static only: "+c);


        int x=19;
        int y=7;
        int s;
        s=rajesh(x,y);
        System.out.println(s);


        foo(45,90);
        foo(700);

        int [] boss ={87,89,76,90,34};
        change (boss);
        System.out.println("the array is change: "+boss[3]);


        System.out.println(mysum(6,7));
        System.out.println(sum(1,4,5,3,9));

    }
}
