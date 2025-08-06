import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int columns=sc.nextInt();
        int [][] arr= new int[rows][columns];
        if(rows==columns){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(i+j==2||i==j){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
}
