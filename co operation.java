public class oper{
    
        int add(int a,int b) {
            return a+b;
        }
        int sub(int a, int b) {
            return b-a;
        }
        int mult(int a, int b) {
            return a*b;
        }
        int div(int a, int b) {
            return a/b;
        }
        
public static void main(String[] args){
    System.out.println("psna");
    oper obj = new oper ();
    System.out.println(obj.add(10,20));
     System.out.println(obj.sub(10,20));
      System.out.println(obj.mult(10,20));
       System.out.println(obj.div(10,20));
    }
}
