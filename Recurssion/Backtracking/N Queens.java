import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        // for(int i=0;i<n;i++){
        //     for(int j =0;j<n;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        
        printNQueens(arr,"",0);
    }

    public static void printNQueens(int[][] arr, String qsf, int row) {
        
        if(row == arr.length ){
            System.out.println(qsf +".");
            return;
        }
        
        
        for(int col=0;col < arr.length;col++){
            if(isThisPlaceSafe(arr,row,col) == true){
                 arr[row][col] =1;
            printNQueens(arr,qsf + row + "-" + col +", ",row + 1);
            arr[row][col] = 0;
                
            }
           
        }
    }
    
    public static boolean isThisPlaceSafe(int[][] arr, int row,int col){
        
        for(int i = row-1,j =col;i>= 0;i-- ){
            if(arr[i][j] == 1)
            return false;
        }
        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j] == 1)
            return false;
        }
        for(int i = row-1,j=col+1;i>=0 && j < arr.length;i--,j++){
            if(arr[i][j] == 1)
            return false;
        }
        return true;
        
        
        
    }
    
    
    
    
    
    
    
}
