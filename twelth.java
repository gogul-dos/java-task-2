import java.util.Scanner;

public class twelth {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Character: ");
        String ch = s.nextLine().toLowerCase();
        System.out.print("Is the entered character is alphabetic? : ");
        
        System.out.println(ch.charAt(0)-'a'>=0 && ch.charAt(0)-'a'<=25);
    }
}
