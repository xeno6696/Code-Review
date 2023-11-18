package primitive.types;

public class CharType {
    public static void main(String[] args) {
        for(char i = 0; i < 127; i++){
            String output = String.format("%x", Byte.toUnsignedInt(((byte)i)));
            System.out.println(output);
        }
        System.exit(0);
    }
}
