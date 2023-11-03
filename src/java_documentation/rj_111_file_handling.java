package java_documentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class rj_111_file_handling {
    public static void main(String[] args) {
        //core to create a new file
       /* File mtfile=new File("rj112file.txt");
        try{
            mtfile.createNewFile();
        }catch(IOException e){
            System.out.println("unable to create this file");
            e.printStackTrace();
        }



        //core to write to a file
        try{
            FileWriter f=new FileWriter("rj112file.txt");
            f.write("this is our first file from this java course \n ok then bey!");
            f.close();
        }catch(IOException e){
            System.out.println();
        }



        //Reading a file
        File f2=new File("rj112file.txt");
        try{
            Scanner sc=new Scanner(f2);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
            catch(FileNotFoundException e){
            e.printStackTrace();
        }*/



        //deleting a file
        File f3=new File("rj112file.txt");
        if(f3.delete()){
            System.out.println("i have deleted: "+f3.getName());
        }else{
            System.out.println("some problem occurred while deleting the file");
        }
    }
}
