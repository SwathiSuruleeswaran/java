import java.util.Scanner;

class book{
    book(String name,int age){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
    
    

public static void  main(String[] args){
       Scanner sc= new Scanner (System.in);
       String name=sc.nextLine();
       int age = sc.nextInt();
       book obj=new book(name,age);
    }
        
    }
