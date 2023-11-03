package java_Advance_level;

class rolex{
    int a;

    public int getA() {
        return a;
    }

    rolex(int v){
        this.a = v;
    }

    public int boss(){
        return 1;
    }
}

class rolex1 extends rolex{
    rolex1(int c){
        super(c);
        System.out.println("I am a new constructor");
    }
}
public class rj_47_ch10_this_super {
    public static void main(String[] args) {
        rolex r = new rolex(78);
        //System.out.println(r.getA());

        rolex1 t= new rolex1(9);
    }
}
