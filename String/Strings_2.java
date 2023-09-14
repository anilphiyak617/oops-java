public class Strings_2 {
    public static void main(String[] args) {
        System.out.println("Strings");

        String s1 = new String("hello"); // in the heap
        String s2 = "hello"; // in the String Pool
        String s3 = "hello";
        StringBuffer s4 = new StringBuffer("this is buffer");
        s4.replace(1, 1, "d");
        for (int i = 0; i < s4.length(); i++) {
            System.out.println(s4.charAt(i));
        }
    }

}