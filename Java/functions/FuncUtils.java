package functions;

public class FuncUtils {
    public static void main(String args[]){
        short foo = 1;
        System.out.println(add(foo, 1));
        System.out.println(add(foo, 2));
    }

    public static short add(short x, short y ){
        short rval = (short) (x + y);
        return rval;
    } 

    public static int add(int x, int y){
        return x + y;
    }
}
