import java.util.Scanner;

public class DAY2_GCD {
    public static void main(String[] args) {
        System.out.println(56%98);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter second number : ");
        int b = sc.nextInt();
        System.out.println("Number is :: " + GCD(a, b));
        sc.close();
    }

    private static int GCD(int a, int b) {
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
