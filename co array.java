import java.util.Scanner;
class oper {
    static void add(int arr[][],int rows,int columns) {
        int n= columns-1;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                if(i+j ==columns-1 || i==j){
                arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++){
            System.out.print(arr[i][j]+" ");
        }
         System.out.println("");
        }
       
    
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int [][] arr = new int[rows][columns];
    add(arr,rows,columns);
}
}
