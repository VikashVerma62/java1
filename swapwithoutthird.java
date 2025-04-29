import java.util.*;
public class swapwithoutthird {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=7;
        int b=3;
        System.out.printf("Before printing or swaping: \n a=%d b=%d ",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("After swaping \n a=%d b=%d ",a,b);

    }
    
}
