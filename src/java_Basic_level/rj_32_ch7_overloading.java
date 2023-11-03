package java_Basic_level;

public class rj_32_ch7_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning "+a+" Bro!");
        System.out.println("Good Morning "+b+" Bro!");
    }

    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=100;
    }


    static void tellJoke(){
        System.out.println("I invented a new word!\n"+
                "Plagiarism!");
    }

    int mySum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        //tellJoke();

        /*rj_32_ch7_overloading obj = new rj_32_ch7_overloading();
        int c;
        c= obj.mySum(4,5);
        System.out.println(c);*/

        // this no change
        /*int [] marks={45,89,76,54,99,34};
        int x = 67;
        change(x);
        System.out.println("the value of x after running change: "+x);*/


        // this is change the array [0]
        int [] marks={45,89,76,54,99,34};
        change2 (marks);
        System.out.println("the value of array after running is: "+marks[0]);


        //method overloading
        foo();
        foo(500);
        foo(300,500); // Arguments are actual!

    }
}
