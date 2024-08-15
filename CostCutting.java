import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
 
class Main {
 
    static Scanner sc = new Scanner(System.in);
 
    public static int readInt() {
        return sc.nextInt();
    }
 
    public static double readDouble() {
        return sc.nextDouble();
    }
 
    public static String readLine() {
        return sc.nextLine();
    }
 
    public static void main(String[] args) {
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            int a[] = new int[3];
            for(int j = 0; j < 3; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println("Case " + (i+1) + ": " + a[1]);
        }
    }
}