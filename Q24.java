import java.util.Scanner;

public class Q24 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int k=1;
        for(int i=1;k<=n;i++){
            for(int sp=1; sp<=n-i;sp++) System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(" "+k);
                k+=1;
            }
            System.out.println();
        }
    }
}
