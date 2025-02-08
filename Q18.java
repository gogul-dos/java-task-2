import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The length of the array: ");
        int n = s.nextInt();
        int[] arr = new int [n];
        for(int i=0; i<n; i++) arr[i] = s.nextInt();
        System.out.println("The Given Array is: "+Arrays.toString(arr));

        for(int i=0;i<n;i+=2){
            for(int j=0; j<n; j+=2){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if(i+1<n && j+1<n){
                    if(arr[i+1]<arr[j+1]) {
                        int temp = arr[i+1];
                        arr[i+1] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        System.out.println(("The final Sorted Array is: "+Arrays.toString(arr)));
    }
}
