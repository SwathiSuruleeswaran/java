import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner john = new Scanner(System.in);
        System.out.print("enter your score");
        int score = john.nextInt();
        if(score<=40){
            System.out.print("fail");
        }else if(score>40 && score<=60){
            System.out.print("just pass");
        }else if(score>61 && score<=80){
            System.out.print("average");
        }else if(score>80 && score<=100){
            System.out.print("best");
        }else{
            System.out.print("Invalid");
        }
    }
}
