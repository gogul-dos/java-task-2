import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number of Students: ");
        int count = s.nextInt();

        String[] groups = {"group-A", "group-B", "group-C", "group-D"};

        for (int g = 0; g < 4; g++) {
            System.out.println(groups[g]);
            for (int i = 101 + g; i < count + 101; i += 4) {
                System.out.println(i);
            }
        }

        s.close();
    }
}
