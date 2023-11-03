package java_Basic_level;

public class rj_java_ch6_ps {
    public static void main(String[] args) {

        //Question 1.
       /* float [] marks={34.7f,56.9f,78.9f,23.5f,12.5f};
        float sum =0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the value of sum: "+sum);*/

        //Question 2.
        int [] marks ={45,89,67,56,23};
        int num=85;
        boolean rolex=false;
        for(int element:marks){
            if(num==element){
                rolex=true;
                break;
            }
        }
        if(rolex){
            System.out.println("the value is present in array");
        }else{
            System.out.println("the value is not present in array");
        }

        //Question 3.

       /* float [] marks={56f,57f,78f,54f,90f};
        float sum =0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the value of average marks is : "+sum/marks.length);*/

        //Question 4.

        int [][] mat1={{1,2,3},
                {6,7,8}};
        int [][] mat2={{4,6,9},
                {3,4,13}};
        int [][] result = {{0,0,0},
                   {0,0,0}};
        for(int i=0;i<mat1.length;i++){         //row number of times
            for(int j=0;j<mat1[i].length;j++){  //colum number of times
                System.out.printf("value for i=%d and j=%d\n",i,j);
                result [i][j] =mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){        //row number if times
            for(int j=0;j<mat1[i].length;j++){ //colum number of times
                System.out.print(result[i][j]+" ");
                result [i][j] =mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }

        //Question 5.

        System.out.println("35");
        int []rolex1={1,2,3,4,5,6};
        int l= rolex1.length;
        int n= Math.floorDiv(l,2);
        int temp;

        for(int i=0;i<n;i++){
            temp=rolex1[i];
            rolex1[i]= rolex1[l-1-i];
            rolex1[l-1-i]=temp;
        }
        for(int element:rolex1){
           // System.out.println(element);
            System.out.print(element+" ");
        }

        //Question 6.

        /*int[]arr={23,45,43,67,300};
        int max = 0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("the value of the maximum in this array is: "+ max);

        //Question 7.

        int [] rock={45,98,78,12,3};
        int min=Integer.MAX_VALUE;
        for(int e:rock){
                    if (min>e){
                min=e;
            }
        }
        System.out.println("the value of the minimum in this array is "+min);*/

        //Question 8.

        boolean isSorted=true;
        int [] arr={23,56,78,3,4,1};
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }


    }
}
