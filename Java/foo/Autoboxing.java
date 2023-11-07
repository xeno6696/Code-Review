package foo;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    /**
     * https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            li.add(Integer.valueOf(i));
            /* 
             * Under the hood the java compiler will auto-promote primitive uses like this
             * for (int i = 0; i < 50; i++ ) becomes
             * for (Integer i = 0; i < 50; i++)
             * The difference is one of class.  
             * 
            */
        }
        short answer = (short) sumEven(li);
        System.out.println(answer);
    }

    //Because the remainder (%) and unary plus (+=) operators do not apply to Integer objects, 
    //you may wonder why the Java compiler compiles the method without issuing any errors. The compiler 
    //does not generate an error because it invokes the intValue method to convert an Integer to an int at runtime:

    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i : li)
            if (i.intValue() % 2 == 0)
                sum += i.intValue();
            return sum;
    }
    
}
