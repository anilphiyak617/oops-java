package package_a;

import package_b.Greeter;
import package_b.CustomMaths;
public class Greeting {
    public static void main(String[] args) {
        System.out.println("This is package a");
        Greeter.message("this is passed from package a");
        System.out.println(CustomMaths.sum(34, 0));
    }    
}


// Class compilation should be done from src directory i.e oops/java