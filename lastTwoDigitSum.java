 import java.util.*;
 public class lastTwoDigitSum{
    
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number"); 
        int n2=sc.nextInt();
        int lastDigit1=n1%10;
        int lastDigit2=n2%10;
        int sum=lastDigit1+lastDigit2;
        System.out.println("sum of last digit is:"+sum);
    }
 }