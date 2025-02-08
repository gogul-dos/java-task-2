import java.util.Scanner;
public class Q5 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the co-efficient of x^2: ");
        int a = s.nextInt();
        System.out.print("Enter the co-efficient of x: ");
        int b = s.nextInt();
        System.out.print("Enter the value of Constant: ");
        int c = s.nextInt();
        double res1 = 0;
        double res2 = 0;
        double sqrt_part = (b*b) - (4*a*c); 
        if(sqrt_part>0){
            res1 = (-b+Math.sqrt(sqrt_part))/2*a;
            res1 = (-b-Math.sqrt(sqrt_part))/2*a;
            System.out.println("The values of X is "+res1+" and "+res2);
        }
        else if(sqrt_part==0){
            res1 = -b/(2*a);
            System.out.println("The value of X is: "+res1);
        }
        else if(sqrt_part<0){
            double real_part = -b/(2*a);
            double imaginary_Part = sqrt_part/(2*a);
            System.out.println("The First value of X: "+ real_part+"+"+(imaginary_Part*-1)+"i");
            System.out.println("The Second value of X: "+ real_part+"-"+(imaginary_Part*-1)+"i");
        }

    }
}
