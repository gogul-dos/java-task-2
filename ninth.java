import java.util.Scanner;
public class ninth {
    public static void main(String [] args){
        System.out.println("Enter a Number To Reverse: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            int last = n%10;
            n/=10;
            System.out.print(last);
        }
    }
}
