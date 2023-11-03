package java_Basic_level;

public class rj_java_ch3_ps {
    public static void main(String[] args) {
        //problem 1.
        String name = "Jack Parker";
        System.out.println(name.toLowerCase());

        //problem 2.
        String text = "To my friend";
        System.out.println(text.replace(" ","_"));

        //problem 3.
        String letter= "Dear <|name|> , thanks a lot!";
        System.out.println(letter.replace("<|name|>","Rolex"));

        //problem 4.
        String mystring= "this string contains  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //problem 5.
        String allletter="Dear harry,\n\t this is java course is nice.\n thanks!";
        System.out.println(allletter);
    }
}
