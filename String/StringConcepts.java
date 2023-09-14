
public class StringConcepts {

    public static void main(String[] args) {
        
        // Strings are not primitive types; they are objects in Java.
        // Here, a String object named 'oldVal' is created and assigned the value
        // "Anil".
        String oldVal = "Anil";

        // Concatenating a new value to the existing 'oldVal'.
        // This creates a new string "AnilSam", and 'oldVal' now references the new
        // string.
        oldVal = oldVal + "Sam";

        // The original string "Anil" remains unchanged in the Heap String pool.
        // 'oldVal' now points to the new string "AnilSam".


        /* STRING DECLARATION */
        
        String bookName = "house of garden";
        String refBookName = "house of garden";
        boolean compareVal = bookName.equals(refBookName); // true
        
        // String literal
        String refBookName2 = new String("house of garden");
        compareVal = bookName.equals(refBookName); // true

        // Comparing string based on Object references
        System.out.println(bookName == refBookName); // TRUE
        SysteString str1 = "Hello";
        String str2 = new String("Hello");
        boolean result = str1.equals(str2); // truem.out.println(bookName == refBookName); // FALSE
 
    
        // System.out.println(oldVal);
    }

}