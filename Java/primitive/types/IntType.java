package primitive.types;

public class IntType{

    public static void main(String[] args) {
        
        for(int i = 0; i < 0x10000; i++){
            System.out.println(Integer.toHexString(i) + ":" + i);
        }

        System.exit(0);
    }
    
}