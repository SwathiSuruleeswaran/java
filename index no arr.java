public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 30) {
                System.out.println(i + "-" + arr[i]);
                return;
            }
        }
        
        System.out.println("Not found");
    }
}



