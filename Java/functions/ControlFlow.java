package funtions;

public class ControlFlow {
    public static void main (String[] args){


        System.exit(0);
    }

    public static String a(boolean uppercase){
        String rval = "";
        if(uppercase){
            rval = "A";
        }else{
            rval = "a";
        }
        return rval;
    }

    public static String c(){
        String rval ="";
        rval = "C";
        return rval;
    }

    public static String t(boolean uppercase){
        String rval = "";
        if(uppercase){
            rval = "A";
        }else{
            rval = "a";
        }
        return rval;
    }

    
        
}
