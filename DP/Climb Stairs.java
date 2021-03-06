import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int x = climb(n);
        System.out.println(x);
    }
    public static int climb(int n){
        if( n== 0){
            return 1;
        }
        if( n<0){
            return 0;
        }
        // climbing stairs
        int p1 = climb(n-1);
        int p2 = climb(n-2);
        int p3 = climb(n-3);
        int res = p1 + p2 + p3;
        return res;
    }

}
