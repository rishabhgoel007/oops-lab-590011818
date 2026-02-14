
import java.util.Scanner;
public class ArraySum {
    public static void main(Integer [] args){
        int sum, sum_array=0;
        Scanner s= new Scanner(System.in);
        sum=s.nextInt();
        int arr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            //arr[i]= s.nextInt();
            sum_array+=args[i];      
        }
        if(sum==sum_array){ }
        else{
            System.out.println("No");

        }


    }
}
