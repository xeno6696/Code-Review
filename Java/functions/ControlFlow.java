package funtions;

public class ControlFlow {
    public static void main (String[] args){
        //

        System.exit(0);
    }

    /**
     * This function returns either a lower or upper case letter "A" depending on the uppercase value being passed in
     * @param uppercase value to signal if you want uppercase
     * @return "A" or "a"`
     */
    public static String a(boolean uppercase){
        String rval = "";
        if(uppercase){
            rval = "A";
        }else{
            rval = "a";
        }
        return rval;
    }

    /**
     * This lower-case c method always returns a Capital C
     * @return {@Code C}
     */
    public static String c(){
        String rval ="";
        rval = "C";
        return rval;
    }

    public static String t(boolean uppercase){
        String rval = "";
        if(uppercase){
            rval = "T";
        }else{
            rval = "t";
        }
        return rval;
    }

    
        
}
