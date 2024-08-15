import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
class Main {
 
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        while (sc.hasNext()) {
            int h = sc.nextInt();
            if(h ==0) return;
            float u0 = sc.nextFloat();
            float u1 = u0;
            float d = sc.nextInt();
            float f = sc.nextInt();
            int count = 0;
            float dis = 0;
            while(true) {
                count++;
                if(u1 > 0) {
                    dis += u1;
                }
                if(dis > h) {
                    System.out.println("success on day " + count);
                    break;
                }
                u1 -= u0 * f/100;
                dis-=d;
                if(dis < 0) {
                    System.out.println("failure on day " + (count));
                    break;
                }
            }
        }
    }
}