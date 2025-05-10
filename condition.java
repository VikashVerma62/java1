import java.util.*;
public class condition{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");

// program to check condition using if and else
                   
        int y=sc.nextInt();
        if(x>y){
            System.out.println("First number is Greater");

        }
    
        if(x<y){
            System.out.println("Second number is Greater");
            
            
        }
            if(x==y){
                System.out.println("Both Number are Equal");
            }
        
     
    }
}