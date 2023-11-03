package java_documentation;

/**
 * this is a good class
 */
public class rj_107_method_tags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("i am main method");
    }

    /**
     *
     * @param a this is the first number to add
     * @param b this is the second number to add
     * @return sum of two number as an integer
     * @throws Exception if a is 0
     * @deprecated this method is deprecated please use + operator
     */
    public int add(int a,int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
        int c;
        c=a+b;
        return c;
    }
}
