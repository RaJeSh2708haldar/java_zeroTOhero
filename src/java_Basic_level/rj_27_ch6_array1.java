package java_Basic_level;

public class rj_27_ch6_array1 {
    public static void main(String[] args) {


       /* int[] marks={56,78,87,90,98};
        float[]raj={67.1f,90,78.9f,56.4f,23.9f};
        String [] students={"raj","rolex","rahul","boss"};
        System.out.println(marks.length);
        System.out.println(raj.length);
        System.out.println(students.length);
        System.out.println(raj[0]);
        System.out.println(students[1]);*/


        System.out.println("normal array: ");
        int[] marks={56,78,87,90,98};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Using for loop :");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("using for loop reverse:");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        System.out.println("using for each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
