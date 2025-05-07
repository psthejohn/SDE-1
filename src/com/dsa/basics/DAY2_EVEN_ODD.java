import java.util.Scanner;

public class DAY2_EVEN_ODD {
    
    private static String is_even_odd(int x){
        return x%2==0 ? "EVEN" : "ODD";
    }

    public static void main(String[] args) {
         System.out.println("Please enter number : ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Number is :: "+ is_even_odd(sc.nextInt()));
        sc.close();
    }
}
