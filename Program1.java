//WAP to take size of array from user & also take integer elements from user print sum of odd elements only

import java.util.*;
class ArrayDemo{
        public static void main (String[] args){
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter Array Size :");
                int size=sc.nextInt();
                int sum=0;

                int arr[]=new int[size];
                System.out.println("Enter Elements :");

                for(int i=0; i<arr.length; i++){
                        arr[i]=sc.nextInt();

                        if(arr[i]%2 !=0){
                                sum=sum+arr[i];
                        }

                }
                System.out.println("Sum of Odd Elements :" +sum);
        }
}
