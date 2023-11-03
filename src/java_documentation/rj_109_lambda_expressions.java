package java_documentation;
@FunctionalInterface
interface DemoAno{
    void meth1(int x);
   // void meth2();
}
/*class rajeshFuck implements DemoAno{
    public void meth1(){
        System.out.println("i am meth1");
    }
}*/
/*class AnonyDemo implements DemoAno{
    public void dispaly(){
        System.out.println("hello");
    }
    @Override
    public void meth1(){
        System.out.println("i am meth1");
    }
    @Override
    public void meth2(){
        System.out.println("i am meth2");

    }
}*/
public class rj_109_lambda_expressions {
    public static void main(String[] args) {
        // AnonyDemo a= new AnonyDemo();
        //a.dispaly();
        //a.meth1();
        //a.meth2();

        //Anonymous class
       /* DemoAno d = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("meth1");
            }

            @Override
            public void meth2() {
                System.out.println("meth2");
            }
        };
        d.meth1();*/

        //lambda Expressions
        //DemoAno d=new rajeshFuck();
        //d.meth1();

        DemoAno k= (x)->{System.out.println("I lambda meth1: "+x);};
        k.meth1(5);


    }
}
