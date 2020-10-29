import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        boolean [][] visited = new boolean[n][m];
        floodfill(arr,0,0,"",visited);
    }

    public static void floodfill(int[][] arr, int row, int col, String psf, boolean [][] visited){
        
        if(row <0 || col <0 || row == arr.length || col == arr[0].length || arr[row][col] == 1 || visited[row][col] == true){
            return;
        }
        
        if(row == arr.length -1 && col == arr[0].length -1){
            System.out.println(psf);
            return;
        }
        
        visited[row][col] = true;
        //top
        floodfill(arr,row-1,col,psf + "t",visited);
        // left
        floodfill(arr,row,col-1,psf +"l",visited);
        // down
        floodfill(arr,row+1,col,psf + "d",visited);
        // right
        floodfill(arr,row,col +1,psf + "r",visited);
        visited[row][col] = false;
    }
}
