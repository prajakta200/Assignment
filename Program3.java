//WAP to take size of array from user and take integer elements from user print product of odd index only

package Array01;
import java.util.*;

public class Program3 {
    
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size :");
        int size=sc.nextInt();
        int mul=1;

        int arr[]=new int[size];
        System.out.println("Enter Array Elements :");

        for(int i=0; i<arr.length ;i++){
                arr[i]=sc.nextInt();

                if(i%2!=0){
                        mul=arr[i]*mul;
                }

        }
        System.out.println("Product of Odd Index is :"+ mul);

        }
}

