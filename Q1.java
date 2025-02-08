import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        System.out.print("Enter an alphabet: ");
    Scanner S = new Scanner(System.in);
    char A = S.next().charAt(0);
    int asc = (int) A;
    if(asc>=65 && asc<=91) for(int i=asc; i<91; i++) System.out.print((char) i);
    else if(asc>=97 && asc<=122) for(int i=asc; i<=122; i++) System.out.print((char) i);
    else System.out.println("Invalid character, You must enter an alphabet only!");
    }
    
}
