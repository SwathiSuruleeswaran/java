import java.util.Scanner;
class calculate{
    void print(int i) {
        System.out.println(i*i);
    }
    public static void main(String[] arags){
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        calculate obj = new calculate();
        obj.print(i);
    }
}
