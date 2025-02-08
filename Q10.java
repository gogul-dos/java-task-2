import java.util.Scanner;
public class Q10 {
    public static void recursive_reverse(String str){
        String [] words = str.split(" ");

        System.out.println(reverse_helper(words,words.length-1));

    }
    public static String reverse_helper(String[] words, int index){
        if(index<0) return "";
        if(index==0) return words[0];
        return words[index] + " " + reverse_helper(words,index-1);
    }
    public static void main(String [] args){
        System.out.println("Enter the string: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        recursive_reverse(str);
    }
}
