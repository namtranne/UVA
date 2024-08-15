import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
class Main {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            int l = sc.nextInt();
            if(l == 0) return;
            sc.nextLine();
            String cur = "+x";
            boolean isHead = true;
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            for(int i = 0; i < l-1; i++) {
                String q = strs[i];
                if(q.equals("No")) continue;
                if(cur.equals("-x")) {
                    if(q.charAt(0) == '-') {
                        cur = "+" + q.charAt(1);
                    }
                    else {
                        cur = "-" + q.charAt(1);
                    }
                }
                else if(cur.equals("+x")) {
                    cur = q;
                }
                else if (cur.charAt(1) == q.charAt(1)) {
                    if(cur.charAt(0) == q.charAt(0)) {
                        cur="-x";
                    }
                    else {
                        cur="+x";
                    }
                }
            }
            System.out.println(cur);
        }
    }
}