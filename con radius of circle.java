import java.util.Scanner;

class circle{
    circle(int radius){
        int d;
        d=2*radius;
        System.out.print(d);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius = sc.nextInt();
        circle obj= new circle(radius);
    }
        
    }
