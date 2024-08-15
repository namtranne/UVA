import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
class Main {
 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            int size = sc.nextInt();
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < size; j++) {
                max = Math.max(max,sc.nextInt());
            }
            System.out.println("Case " + (i+1)+": " + max);
        }
        
    }
}