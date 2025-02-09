import java.util.Scanner;

public class Q29 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            if (i==0 || i==n-1) {
                for(int j=0; j<n; j++) System.out.print("*");
                System.out.println();
            }
            else{
                System.out.println("*");
            }
        }
    }
}
