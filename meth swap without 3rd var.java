import java.util.Scanner;
class hellojava{
public static void hello(){
    int a=10;
    int b=20;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a);
     System.out.println(b);
    
}
    public static void main(String[] args) {
        hellojava obj=new hellojava();
        obj.hello();
    }
}
