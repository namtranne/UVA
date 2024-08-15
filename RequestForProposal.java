import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
 
class Main {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int index = 0;
        while(true) {
            index++;
            int req = sc.nextInt();
            int p = sc.nextInt();
            if(req == 0 && p == 0) {
                return;
            }
            else if(index > 1) {
                System.out.println("");
            }
            for(int i = 0; i <= req; i++) {
                sc.nextLine();
            }
            String result = "";
            float cur_price = 0;
            int cur_req = 0;
            for(int i =0; i < p; i++) {
                String name = sc.nextLine();
                float price = sc.nextFloat();
                int new_req = sc.nextInt();
                for(int j =0; j<=new_req; j++) {
                    sc.nextLine();
                }
                if(new_req == cur_req) {
                    if(price < cur_price) {
                        cur_price= price;
                        result = name;
                    }
                }
                else if(new_req > cur_req) {
                    cur_req = new_req;
                    cur_price = price;
                    result = name;
                }
            }
            System.out.println("RFP #" + index);
            System.out.println(result);
        }
        
    }
}