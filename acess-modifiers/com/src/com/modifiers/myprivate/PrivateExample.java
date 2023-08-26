
package com.modifiers.myprivate;

//* Default - package private*//
// can be accessed from the same package i.e com.modifiers.myprivate
class PrivateExample {

    // can only accessed from the same class i.e PrivateExample 
    private int value = 3;

    private void privateMethod() {
        System.out.println("This is a private method");
    }

}