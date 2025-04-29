public class swapmultianddivi {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.printf("Before swaping: \n a=%d b=%d",a,b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.printf("\n After swaping \n a=%d b=%d ",a,b);
    }
    
}
