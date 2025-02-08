import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Choose an Option:");
        System.out.println(" 1. AND (&)\n 2. OR (|)\n 3. NOT (~)\n 4. XOR (^)");
        System.out.println(" 5. LEFT SHIFT (<<)\n 6. RIGHT SHIFT (>>)\n 7. UNSIGNED RIGHT SHIFT (>>>)");

        Scanner s = new Scanner(System.in);
        int ans = s.nextInt();

        if (ans < 1 || ans > 7) {
            System.out.println("Invalid Option! Please enter a number between 1 and 7.");
        } else {
            System.out.print("Enter the value of A: ");
            int a = s.nextInt();

            int b = 0, shift = 0;
            if (ans != 3 && ans <= 4) {
                System.out.print("Enter the value of B: ");
                b = s.nextInt();
            }
            if (ans >= 5) {
                System.out.print("Enter the number of positions to shift: ");
                shift = s.nextInt();
            }

            switch (ans) {
                case 1:
                    System.out.println("Bitwise AND (A & B) = " + (a & b));
                    break;
                case 2:
                    System.out.println("Bitwise OR (A | B) = " + (a | b));
                    break;
                case 3:
                    System.out.println("Bitwise NOT (~A) = " + (~a));
                    break;
                case 4:
                    System.out.println("Bitwise XOR (A ^ B) = " + (a ^ b));
                    break;
                case 5:
                    System.out.println("Left Shift (A << shift) = " + (a << shift));
                    break;
                case 6:
                    System.out.println("Right Shift (A >> shift) = " + (a >> shift));
                    break;
                case 7:
                    System.out.println("Unsigned Right Shift (A >>> shift) = " + (a >>> shift));
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
        s.close();
    }
}
