import java.util.Scanner;

public class Q23 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        for(int i=n; i>=1; i--){
            for(int sp=i; sp<=n-1;sp++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print(" "+i);
            System.out.println();
        }
    }
}
