import java.util.Arrays;

public class Q17 {
    public static void main(String [] args){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int [] arr1 = new int[arr.length];

        int i=0, j=arr.length-1,k=0;

        while(i<=j){
            arr1[k++] = arr[j--];
            if(i<=j) arr1[k++] = arr[i++];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
