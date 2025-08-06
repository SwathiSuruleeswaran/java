import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= 0;
        int b= 0;
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] =a;
                a+=10;
                b+=a;
            }
        }
        System.out.println(b);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
      }
}
}
