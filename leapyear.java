import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner john = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = john.nextInt();
        if(year%4==0){
            System.out.print("leap year");
        }else{
            System.out.print("not a leap yaer");
        }
    }
}
