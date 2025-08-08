import java.util.Scanner;
class calculate{
    void print(int a ) {
       if (a%2==0) {
           System.out.print("even");
       }else{
           System.out.print("odd");
       }
    }
    public static void main(String[] arags){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        calculate obj = new calculate();
        obj.print(a);
    }
}
