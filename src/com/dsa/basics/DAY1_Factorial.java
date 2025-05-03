import java.util.Scanner;

public class DAY1_Factorial {

    private static int factorial (int n){
        int result = 1;
        while(n>0){
            result*=n--;
        }
        return result;
    }
    // private static int factorial (int n){
    //     if (n<1) return 1;
    //     return n*factorial(n-1);
    // }

    public static void main(String args[]){
        
        System.out.println("Please enter number : ");

        Scanner sc = new Scanner(System.in);
        System.out.println("factorial is :: "+ factorial(sc.nextInt()));
        sc.close();
    }
}
