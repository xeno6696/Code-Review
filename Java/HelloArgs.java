public class HelloArgs {

    public static void main(String [] args){
        //Wait!  if Java is based on C... where is argc?
        for(String arg : args){
            System.out.println(arg);
        }
    }
}
