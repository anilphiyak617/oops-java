package com.modifiers.myprotected;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of ProtectedExample
        ProtectedExample obj = new ProtectedExample();

        // Calling the protectedMethod
        obj.protectedMethod();


        // can be acessed from the suib-classes even outside the package
    }
}
