import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        if(num1%num2==0 || num2%num1==0 ) {
            System.out.println("Multipled");
        }
    }
}
