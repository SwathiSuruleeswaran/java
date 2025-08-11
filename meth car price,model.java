import java.util.Scanner;
class car{
    void model(){
        Scanner sc = new Scanner(System.in); 
        String model = sc.nextLine();
        int price = sc.nextInt();
        details(model,price);
        
    } 
    void details(String model,int price){
        System.out.println("model:"+ model);
        System.out.println("price:"+ price);
        discount(price);}
        
    void discount(int price){
            int discount;
            discount=price-(price*25/100);
            System.out.println("discount:" + discount);
        }
     public static void main(String[] args) {
            car obj = new car();
            obj.model();
            
        }
    }

    
    
    
    
    
    
    




