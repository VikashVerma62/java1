public class string {
    public static void main(String[] args) {
       String x1="hello ";
       String x2="world";
       String x3=x1.concat(x2);
       System.out.println(x1);
       System.out.println(x2);
       System.out.println(x3);

       StringBuffer x4= new StringBuffer("hello");
       StringBuffer x5= new StringBuffer("world");
        x4.append(x5);
        System.out.println(x4);

        StringBuilder x6= new StringBuilder("hello");
       StringBuilder x7= new StringBuilder("world");
        x6.append(x7); 
        System.out.println(x4);

    }
}
