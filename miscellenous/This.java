import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {

    private String name ="";
    private int rank = 0;

    
    protected Student(String name) {
        this("William lin", 234);
        this.name = name;
    }

    Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    //  getter methods
    public String getName() {
        return name;
    }

}

public class This {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
    }

};



// overriding custome toString method to print the class structure
// @Override
// public String toString() {
// StringBuilder sb = new StringBuilder();
// sb.append("Class: ").append(getClass().getName()).append("\n");

// // Get fields
// Field[] fields = getClass().getDeclaredFields();
// sb.append("Fields:\n");
// for (Field field : fields) {
//     sb.append("  ").append(field.getName()).append(": ");
//     try {
//         field.setAccessible(true);
//         sb.append(field.get(this));
//     } catch (IllegalAccessException e) {
//         sb.append("N/A");
//     }
//     sb.append("\n");
// }

// // Get methods
// Method[] methods = getClass().getDeclaredMethods();
// sb.append("Methods:\n");
// for (Method method : methods) {
//     sb.append("  ").append(method.getName()).append("\n");
// }

// return sb.toString();
// }