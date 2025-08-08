import java.util.Scanner;
class Main {
    public static void print()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String a = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            a+= input.charAt(i); 
        }
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + a);
	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.print();
	}
}
