import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        
            if(arr[i]%2==0){
                System.out.println("even: "+arr[i]);
            }
            else{
                System.out.println("odd: "+arr[i]);
            }
        }
    }
}
