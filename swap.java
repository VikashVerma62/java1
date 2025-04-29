import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1;
        num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(" After sweping first number is: "+num1);
        System.out.println(" After sweping second number is: "+num2);

        
    }
    
}
