import java.util.Scanner;
public class eighth {
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a Character: ");
        char a = s.next().charAt(0);
        System.out.println("The ASCII value of "+a+" is: "+ (a+0));
    }
}
