import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[]a1 = new int[n1];
    for(int i=0;i<n1;i++){
        a1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int []a2 = new int[n2];
    for(int i=0;i<n2;i++){
        a2[i] = scn.nextInt();
    }
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for(int val:a1){
        if(hm.containsKey(val)){
            int oldFrequency = hm.get(val);
            int newFrequency = oldFrequency+1;
            hm.put(val,newFrequency);
        }else{
            hm.put(val,1);
        }
    }
    
    for(int val:a2){
        if(hm.containsKey(val) && hm.get(val) >0){
            System.out.println(val);
            int oldFrequency = hm.get(val);
            int newFrequency = oldFrequency - 1;
            hm.put(val,newFrequency);
        }
    }
 }

}
