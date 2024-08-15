import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Main {
 
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
        while(true) {
            int k = sc.nextInt();
            if(k==0) break;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i = 0; i < k; i++) {
                int xx = sc.nextInt();
                int yy = sc.nextInt();
                if(xx == x || yy == y) {
                    System.out.println("divisa");
                }
                else if(xx > x) {
                    if(yy  > y) {
                        System.out.println("NE");
                    }
                    else {
                        System.out.println("SE");
                    }
                }
                else {
                    if(yy > y) {
                        System.out.println("NO");
                    }
                    else {
                        System.out.println("SO");
                    }
                }

            }
        }
    }
}