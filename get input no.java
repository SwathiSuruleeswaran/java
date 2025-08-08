import java.util.Scanner;
class hellojava{
public static void getinput(){
    Scanner sc=new Scanner(System.in);
        int favnum=sc.nextInt();
        display(favnum);
    }
public static void display(int favnum){
    System.out.println("the number is: "+favnum);
    
}

    public static void main(String[] args) {
        
        
        hellojava obj=new hellojava();
        obj.getinput();
        
    }
}
