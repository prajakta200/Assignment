//WAP ,take characters as an input ,print only vowels from the array
package Array01;
import java.util.*;
public class Program4 {
        public static void main(String[] args){
                int sum=0;

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter size of Array :");

                int size=sc.nextInt();
                char arr[]=new char[size];

                System.out.println("Enter Array Elements :");

                for(int i=0;i<size;i++){
                        arr[i]=sc.next().charAt(0);
                }
                for(int i=0; i<arr.length ;i++){
                        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                                System.out.println(arr[i] + " ");
                        }
                }
        }
}


