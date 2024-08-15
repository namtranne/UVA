import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
        while(sc.hasNext()) {
            int p = sc.nextInt();
            int budget = sc.nextInt();
            int hotels = sc.nextInt();
            int weeks = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < hotels; i++) {
                int price = sc.nextInt();
                for(int j = 0; j <weeks; j++) {
                    int beds = sc.nextInt();
                    if(beds >= p && p * price <= budget) {
                        min = Math.min(p*price, min);
                    }
                }
            }
            if(min != Integer.MAX_VALUE) {
                System.out.println(min);
            }
            else {
                System.out.println("stay home");
            }
        }
    }
}