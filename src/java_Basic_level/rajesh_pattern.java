package java_Basic_level;

public class rajesh_pattern {
    public static void main(String[] args) {
        System.out.println("pattern1");
        int x=4;
        for(int i=x;i>0;i--) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("pattern2 Reverse");
        int k=4;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("pattern3");
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("pattern4");
        int n1=4;
        int m1=5;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=m1;j++){
                if(i==1||j==1||i==n1||j==m1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("pattern5");
        int x1=5;
        for(int i=1;i<=x1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("pattern6 Reverse");
        int y1=5;
        for(int i=y1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("pattern7");
        int r1=5;
        for(int i=1;i<=r1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("pattern8");
        int g=5;
        int num=1;
        for(int i=1;i<=g;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }


        System.out.println("pattern9");
        int t1=5;
        for(int i=t1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("pattern10");
        int k1=5;
        for(int i=1;i<=k1;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

        System.out.println("Butterfly pattern11");
        int a1=4;
        for(int i=1;i<=a1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            int s=2*(a1-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            int s=2*(a1-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Solid Rhombus pattern12");
        int b1=5;
        for(int i=1;i<=b1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=b1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Diamond pattern13");
        int c=5;
        for(int i=1;i<=c;i++){
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=c;i>=1;i--){
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Number pyramid pattern14");
        int e=5;
        for(int i=1;i<=e;i++){
            for(int j=1;j<=e-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        System.out.println("palindromic pattern15");
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
