//WAP to take size of array from user and also take integer elements from user print product of even elements only.

package Array01;
import java.util.*;
public class Program2 {

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                int mul=1;
                System.out.println("Enter Array Size :");
                int size=sc.nextInt();

                int arr[]=new int[size];
                System.out.println("Enter Array Elements :");

                for(int i=0; i<arr.length; i++){
                        arr[i]=sc.nextInt();

                        if(arr[i]%2 ==0){
                                mul=mul*arr[i];
                        }
                }
                System.out.println("Product of Even Elements :"+ mul);
        }
}

