public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1,15,22,60};
        
      for (int i=0;i<numbers.length;i++)  {
           if(numbers[i]%2==0){
               System.out.println("Even:"+numbers[i]);
           }else{
               System.out.println("Odd:"+numbers[i]);
           }
        }
    }
}
