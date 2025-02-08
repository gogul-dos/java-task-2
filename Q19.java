import java.util.Arrays;
import java.util.Scanner;
public class Q19 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The m value: ");
        int m = s.nextInt();
        System.out.print("Enter The n value: ");
        int n = s.nextInt();
        int[][] arr = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Enter the value of "+i+","+j+": ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("The Entered Array is: ");
        for(int[] row: arr) System.out.println(Arrays.toString(row));
        int first = arr[0][0];
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols-1;j++){
                arr[i][j] = arr[i][j+1];
            }
            if(i<rows-1){
                arr[i][cols-1] = arr[i+1][0];
            }
        }
        arr[rows-1][cols-1] = first;
        System.out.println("The Modified Array is: ");
        for(int[] row: arr) System.out.println(Arrays.toString(row));

    }
}
