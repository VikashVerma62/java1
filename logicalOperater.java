public class logicalOperater {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        boolean r=(a>b ||b<c);
        System.out.println("Result is: "+r);
        boolean A=(a<b && b<c);
        System.out.println("Result is: "+A);
        boolean N=!(a>b || b<c);
        System.out.println("Result is:"+N);
    }
}
