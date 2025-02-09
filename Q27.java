import java.util.Scanner;

public class Q27 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str1 = s.nextLine();
        System.out.print("Enter the sub string: ");
        String str2 = s.nextLine();
        System.out.println("The main string is: "+str1);
        System.out.println("The sub string is: "+str2);
        System.out.println("The index is: "+str1.indexOf(str2));
    }
}
