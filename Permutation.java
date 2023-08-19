import java.util.Scanner;

public class Permutation {
    public static void main(String args[]) {

        System.out.print("Start");
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt(36);
        System.out.print("Helsddflo\n");

        int n = len;
        // int n = 9;
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

// dsfdsfdsfdsf
// [1,2,3,4]
// [ 3 2,3,4]
// [2^4]
// [1^2^3^4]
// [1^3]

// x^y
// 1
// 1 2
// 3 5 8
