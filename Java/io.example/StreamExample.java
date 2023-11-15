package io.example;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class StreamExample {
    public static void main(String[] args) {

        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        InputStream stdin = System.in;  //See ScanXan.java

        stdout.println("Hello again!");
        stderr.println("WARNING!  ALL YOUR BASE ARE BELONG TO US!");
        

        System.exit(0);
    }
}
