import java.util.Scanner;
class calculate{
    void print(int a,int b) {
        int c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] arags){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate obj = new calculate();
        obj.print(a,b);
    }
}
