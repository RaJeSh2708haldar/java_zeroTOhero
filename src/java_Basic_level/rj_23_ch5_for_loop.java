package java_Basic_level;

public class rj_23_ch5_for_loop {
    public static void main(String[] args) {
        System.out.println("welcome for loop");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        // 2n = even numbers = 0,2,4,6,8
        //2n+1 = odd numbers = 1,3,5,7,9
        System.out.println("odd number for loop");
        int n=10;
        for(int i=0;i<n;i++){
            System.out.println(2*i+1);
        }

        System.out.println("even number for loop");
        int r=5;
        for(int i=0;i<r;i++){
            System.out.println(2*i);
        }

        System.out.println("decrementing for loop");

        int v=5;
        for(int i=v;i>0;i--){
            System.out.println(i);
        }

        for(int i=7;i!=0;i--){
            System.out.println(i);
        }
    }
}
