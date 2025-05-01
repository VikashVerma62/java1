 import java.util.*;
 public class secondLast{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int slast=(n%100)/10;
        int tlast=(n%1000)/100;
        System.out.println("the second digit of the number is: "+slast);
        System.out.println("the third last digit of a number is: "+tlast);


    }
 }