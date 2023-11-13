package functions;

/**
 * XUtils classes are an old but still oft-used idea where you create a class that simply collects a large array 
 * of useful and related functions.  Apache has StringUtils for example that even provides some nominal escaping
 * libraries for output escaping.  However, in java programming land, classes like this are often viewed as "bad"
 * as they essentially break the idea that Java is supposed to be an OOP language.  
 * 
 * We won't cover that in this class really because OOP design has had more pages written about it than exist in the
 * Bible + Qu'ran combined.  
 */
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
