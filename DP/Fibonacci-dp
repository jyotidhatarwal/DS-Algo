import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f = fibMemoized(n,new int[n+1]);
    System.out.println(f);
    
 }
 
public static int fibMemoized(int n, int[] qb){
    if(n == 0 || n ==1){
        return n;
    }
    
    if(qb[n] != 0){
        return qb[n];
    }
    
    int res = fibMemoized(n-1,qb) + fibMemoized(n-2,qb);
    qb[n] = res;
    return res;
}
}
