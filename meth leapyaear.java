import java.util.Scanner;
class calculate1{
    void print(int a ) {
       if (a%4==0) {
           System.out.print("leap year");
       }else{
           System.out.print("not leap");
       }
    }
    public static void main(String[] arags){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        calculate1 obj = new calculate1();
        obj.print(a);
    }
}
