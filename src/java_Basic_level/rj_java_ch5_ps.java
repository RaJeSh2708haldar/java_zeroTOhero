package java_Basic_level;

public class rj_java_ch5_ps {
    public static void main(String[] args) {

        //Question 1.
        //   * * * *
        //   * * *
        //   * *
        //   *
         /* int n= 4;
        for(int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //Question 2.

        /*int sum=0;
        int n =5;
        for (int i =0;i<n;i++){
            sum= sum+(2*i);
        }
        System.out.println("sum of even numbers is : "+sum);*/

        //Question 3.

       /* int n = 6;
        for(int i =0;i<=10;i++){
            System.out.printf("%d x %d = %d \n",n,i,n*i);
        }*/

        //Question 4.

        /*int t=10;
        for(int i=10;i>=1;i--){
            System.out.printf("%d x %d = %d \n",t,i,i*t);

        }*/

        //Question 5.

        /*int n= 5;
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.println(factorial);*/

        //Question 6.

        /*int n =5;
        int i = 1;
        int factorial1 = 1;
        while(i<=n){
            factorial1*=i;
            i++;
        }
        System.out.println(factorial1);*/


        //Question 7.

       /* int n=4;
        int i=4;
        while(i>0){
            int j=0;
            while(j<i){
             System.out.print("*");
             j++;
            }
            System.out.println();
            i--;
        }*/

        //Question 9.

        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);

        //Question 11.

        /*int n=5;
        int sum =0;
        int i= 0;
        while(i<n){
            sum=sum+(2*i);
            i++;
        }
        System.out.println(sum);*/
    }
}
