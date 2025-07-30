import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a = 10,b=20,c=30;
        if(a>b&&a>c){
            System.out.print("a is greater");
        }else if(b>c&&b>a){
            System.out.print("b is greater");
        }else{
            System.out.print("c is greater");
        }
    }
}
