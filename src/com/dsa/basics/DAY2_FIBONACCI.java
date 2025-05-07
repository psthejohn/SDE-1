import java.util.Scanner;

public class DAY2_FIBONACCI {

    // private static int fibonacci (int n){
    //     if (n<2) return n;
    //     int first = 0, second = 1;
    //     System.out.print(first+", "+second+", ");
    //     while(n>2){
    //         int temp = first;
    //         first = second;
    //         second = temp+first;
    //         System.err.print(second+", ");
    //         n--;
    //     }
    //     return second;
    // }
    private static int fibonacci (int n){
        if (n<2) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[]){
        
        System.out.println("Please enter number : ");

        Scanner sc = new Scanner(System.in);
        System.out.println("fibonacci is :: "+ fibonacci(sc.nextInt()));
        sc.close();
    }
}
