import java.util.Scanner;
class calculate1{
    void print(int a, int b, int c ) {
       if (a>b) {
           System.out.print("a is larger");
       }else if(b>c) {
           System.out.print("b is larger");
       }else if( c >a){
            System.out.print("c is larger");
       }
    }
    public static void main(String[] arags){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calculate1 obj = new calculate1();
        obj.print(a,b,c);
    }
}
