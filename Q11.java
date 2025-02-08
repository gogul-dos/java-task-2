import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String str = s.nextLine();
        s.close();

        StringBuilder result = new StringBuilder();
        char ch = '-';
        int times = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                ch = str.charAt(i);
                times = 0;
            }

            while (i +1< str.length() && Character.isDigit(str.charAt(i+1))) {
                times = times * 10 + (str.charAt(i+1) - '0');
                i++;
            }
            result.append(String.valueOf(ch).repeat(times));
        }

        System.out.println("Output: " + result);
    }
}
