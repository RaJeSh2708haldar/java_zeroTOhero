package java_Basic_level;

public class rj_24_ch5_break {
    public static void main(String[] args) {

       // System.out.println("break statement");


        /*  for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("loop ends here");*/


       /* int i=0;
        while(i<5){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("ending the loop");
                break;
            }
            i++;
        }*/

       /* int i=0;
        do{
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("ending the loop");
                break;
            }
            i++;
        }while (i<5);*/


       /* System.out.println("continue statement");



        for(int i=0;i<5;i++){
            if(i==2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }*/

         /* int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }while (i<5);*/


        int i=0;
        while(i<5) {
            i++;
            if (i == 2) {
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }
}
