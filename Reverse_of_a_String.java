import java.util.Scanner;
public class Reverse_of_a_String {
     public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        char[] Orignal_letters = sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = Orignal_letters.length - 1; i >= 0; i--) {
            System.out.print(Orignal_letters[i]);
        }
        System.out.print("\n");
    }
}


