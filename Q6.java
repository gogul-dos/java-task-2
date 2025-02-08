import java.util.Scanner;
public class Q6 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Value of A: ");
        int temp1 = s.nextInt();
        System.out.print("Enter the Value of B: ");
        int temp2 = s.nextInt();
        int a = temp1;
        int b = temp2;
        System.out.println("Initial Values: A = " + a + ", B = " + b);
        System.out.println("The Value of ++a-b-- is: "+ (++a-b--));
        a=temp1;
        b=temp2;
        System.out.println("Initial Values: A = " + a + ", B = " + b);
        System.out.println("The Value of a%b++ is: "+ (a%b++));
        a=temp1;
        b=temp2;
        System.out.println("Initial Values: A = " + a + ", B = " + b);
        System.out.println("The Value of a*=b+5 is: "+ (a*=b+5));
        System.out.println("The Value of 69>>>2 is: "+(69>>>2));
        
    }
}
