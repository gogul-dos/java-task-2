import java.util.Scanner;

public class Q21 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        for(int i=n; i>=1;i--){
            for (int sp=n-i; sp<n;sp++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(" "+j);
            }
            for(int k=n-1; k>=i;k--){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
