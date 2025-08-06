public class Main{
    public static void main(String[] args) {
        int[][] table = new int[1][10]; 
        
        for (int i = 0; i < 10; i++) {
            table[0][i] = 5 * (i + 1);
        }
        System.out.println("5th Multiplication Table:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " * 5 = " + table[0][i]);
        }
    }
}
