package foo;

public class ReturnTypes {
    public static void main(String[] args){
        System.out.println(addMe(1+1));
    }

    // FIXME
    public static int addMe(int x, int y){
        //If you haven't covered the best practice of non-destructive variable usage... now might be good!
        int sum = x + y;  
    }

}
