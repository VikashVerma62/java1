import java.util.*;
public class lastDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,last;
        System.out.println("enter a number");
        n=sc.nextInt();
        last=n%10;
        System.out.println("the last digit of the number is: "+last);

    }
}