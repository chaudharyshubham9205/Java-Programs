import java.util.*; 
public class Fizz_Buzz {
 public static void main(String[] args)
 {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: Fizz Buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: Buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: Fizz",i);
            } 
        }
        System.out.printf("\n");
    }
}


