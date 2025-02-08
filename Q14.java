import java.util.Arrays;
import java.util.Scanner;

public class Q14{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        int [] new_arr = new int[n];
        for(int j=0; j<n; j++) new_arr[j] = arr[j];
        System.out.println("The Original array is "+Arrays.toString(arr)+", The address is: "+arr);
        System.out.println("The Copied Array is : "+ Arrays.toString(new_arr)+", The address is: "+new_arr);
    }
}