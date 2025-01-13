package com.test.utilities;

public class Debug {
    public static void log(String data) {
        System.out.println(data);
    }

    // Method overloading
    public static void log (int data) {{
        System.out.println(data);}
    }

    public static void log (boolean data) {
        System.out.println(data);
    }
}
