import java.util.*;

public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,endroll;
        int p, c,m,h,e,total;
        float per;
        char s;
        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter enddrollment NO: ");
        endroll=sc.nextLine();
        System.out.println("enter section");
        s=sc.next().charAt(0);
        System.out.println("enter p");
        p=sc.nextInt();
        System.out.println("enter c");
        c=sc.nextInt();
        System.out.println("enter m");
        m=sc.nextInt();
        System.out.println("enter h");
        h=sc.nextInt();
        
        System.out.println("enter e");
        e=sc.nextInt();
        total=p+c+m+h+e;
        per=total/5;
        
    System.out.println("Name: "+name);
    System.out.println("Endrollment No: " +endroll);
    System.out.println("Section: " +s);
    System.out.println("Total marks: "+total);
    System.out.println("Percentage"+per);

    }
    
}
