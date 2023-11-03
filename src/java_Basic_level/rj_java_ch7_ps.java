package java_Basic_level;

public class rj_java_ch7_ps {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }

    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumrolex(int n){
        if(n==1){
            return 1;
        }
        return n+ sumrolex(n-1);
    }

    static int fib(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }

    static float array(float ... arr){
        float sum=0;
        float avg=0;
        for(float e:arr){
            sum+=e;
            avg=(sum/(arr.length));
        }
        return avg;
    }

    static void pattern2(int n){
        if(n>0){
            for(int i=n;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            pattern2(n-1);
        }
    }

    static void pattern3(int n){
        if(n>0){
            pattern3(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void temperature(float a){
        if(a==0)
        {
        System.out.println("32 faherenit");
    }else{
            float f=(a*9/5.0f)+32;
            System.out.println(f+"faherenit");
        }
    }

    static int natural(int x){
        int sum=0;
        for(int i=0;i<=x;i++){
            sum= sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // problem 1.
       // multiplication(9);

        // problem 2.
       // pattern(4);

        //problem 3.
        int c=sumrolex(5);
       System.out.println(c);

        //problem 4.
        pattern1(4);

        //problem 5.
        //fibonacci series=0,1,1,2,3,5,8,13,21,34
        // int result = fib(6);
       // System.out.println(result);

        //problem 6.
        System.out.println("avg of student is: "+ array(56,78,89,90,78));

        //problem 7.
        pattern2(4);

        //problem 8.
        pattern3(4);

        //problem 9.
        temperature(45);

        //problem 10.
        System.out.println(natural(5));

    }
}
