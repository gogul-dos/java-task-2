import java.util.Scanner;

public class Q28 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the terms: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = (sum*10) + i;
        }
        System.out.println("the result is: "+sum);
    }
}
