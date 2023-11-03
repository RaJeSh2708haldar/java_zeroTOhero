package java_Basic_level;

public class rj_14_ch3_string_methods {
    public static void main(String[] args) {
        String name ="Rolex";
        /*System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String name1 = "   Rolex   ";
        System.out.println(name1.trim());
        System.out.println(name1);*/

        /*System.out.println(name.substring(2));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('o','a'));
        System.out.println(name.replace("lex","raj"));

        System.out.println(name.startsWith("Rol"));

        System.out.println(name.endsWith("lex"));*/

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("ex"));

        System.out.println(name.lastIndexOf("ex",4));

        System.out.println(name.equals("Rolex"));

        System.out.println(name.equalsIgnoreCase("rolex"));

        System.out.println("i am rolex \n but not sound");
    }
}
