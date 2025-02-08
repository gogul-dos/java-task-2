import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fifteen {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        Set <Integer> seen = new HashSet<>();
        for(int i=0; i<n; i++){
            if(seen.contains(arr[i])) System.out.println(arr[i]);
            else seen.add(arr[i]);
        }
        
    }
}
