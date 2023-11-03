package java_Advance_level;

public class rj_86_ch14_ps {
    public static void main(String[] args) {
        //problem no:1
        //int a=7 ----->syntax error
        int age=67;
        int born_year=2000-67; //----->logical error
        //System.out.println(6/0);//---->runtime error

        //problem no:2
        try{
            int k=666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }

        //problem no:3



    }
}
