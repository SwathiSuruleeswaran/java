public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {10, 70, 50, 40, 70};
        int sum =numbers[0];

       for (int i=1;i<numbers.length;i++)  {
            sum += numbers[i];
        }

        System.out.println( sum);
    }
}
