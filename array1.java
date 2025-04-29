import java.util.*;
public class array1{
    public static void main(String args[]){
        int arr[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element index of 0:");
        arr[0]=sc.nextInt();
        System.out.println("enter element index of 1:");
        arr[1]=sc.nextInt();
        System.out.println("enter element index of 2:");
        arr[2]=sc.nextInt();
        System.out.println("enter element index of 3:");
        arr[3]=sc.nextInt();
        System.out.println("enter element index of 4:");
        arr[4]=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
 }