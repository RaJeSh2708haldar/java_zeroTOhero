package java_Basic_level;


public class method_ps1 {

    // this is equation 1+2+3+4+5+6+7=28
    static int sum (int n){
        if(n==1){
            return 1;
        }
        return n+ sum (n-1);
    }


    // this is equation 1*2*3*4*5=120
    static int rolex(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*rolex(n-1);
        }
    }

    //this is for loop
    static int factorial1(int d){
        if(d==0||d==1){
            return 1;
        }else{
            int result =1;
            for(int i=1;i<=d;i++){
                result *= i;
            }
            return result;
        }
    }



   // this equation 0+1=1+2=3+5=8+13=21+34=55
    static int fibo (int x){
        if (x == 1){
            return 0;
        }else if (x==2){
            return 1;
        }else{
            return fibo(x-1)+fibo(x-2);
        }
    }



     public static void main(String[] args) {
        int r=sum(4);
        System.out.println(r);

        int equation = fibo(8);
        System.out.println(equation);



        int g =rolex(5);
         System.out.println(g);


         System.out.println("the factorial: "+factorial1(7));

     }
}
