// WAP,take 10 inputs from the user and print only elements that are divisible by 5.

package Array01;
import java.util.*;
public class Program5{

        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];
        System.out.println("Enter Array Elements :");

        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();

                if(arr[i]%5==0){
                        System.out.println(arr[i]);
                }
        }
        }
}

