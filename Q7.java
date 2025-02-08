public class Q7 {
    public static void main(String [] args){
        int a = 28;
        System.out.println("The value of a+=a++ + ++a + --a + a-- where a is "+a+" is : " + (a+=(a++) + (++a) + (--a) + (a--)));
    }
}
