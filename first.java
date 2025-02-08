import java.util.Scanner;
public class first {
    public static void main(String[] args){
        System.out.print("Enter an alphabet: ");
    Scanner S = new Scanner(System.in);
    char A = S.next().charAt(0);
    int asc = (int) A;
    for(int i=asc; i<91; i++) System.out.print((char) i);
    }
    
}
