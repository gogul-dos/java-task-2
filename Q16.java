import java.util.ArrayList;

public class Q16 {
    public static void main(String [] args){
        int[] arr1 = new int[]{2,4,5,6,7,9,10,13};
        int[] arr2 = new int[]{2,3,4,5,6,7,8,9,11,15};

        ArrayList <Integer> res = new ArrayList<>();
        int i = 0,j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res.add(arr1[i]);
                i+=1;
            }
            else if(arr1[i]>arr2[j]){
                res.add(arr2[j]);
                j+=1;
            }
            else{
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            res.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            res.add(arr2[j]);
            j++;
        }

        System.out.println(String.valueOf(res));
    }
}
