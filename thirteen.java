import java.util.Scanner;
import java.util.Arrays;

public class thirteen {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = s.nextInt();
        int [] arr = new int[n];
        int least = 2^8;
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
            if (arr[i]<least) least=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The Least Value is: "+ least);
    }
}
