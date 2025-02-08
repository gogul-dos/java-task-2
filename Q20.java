import java.util.Scanner;

public class Q20 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            for(int sp = 1; sp<=n-i;sp++) System.out.print("  ");
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
