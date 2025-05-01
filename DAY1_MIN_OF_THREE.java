import java.util.Scanner;

public class DAY1_MIN_OF_THREE {
    public static void main(String[] args) {
        
        System.out.print("Please enter numers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("\nPlease enter second number");
        int num2 = sc.nextInt();
        System.out.print("\nPlease enter third number");
        int num3 = sc.nextInt();

        System.out.println("Minimum is :: "+min(num1,num2,num3));
    }

    private static int min(int num1,int num2,int num3){
        return (num1>num2) ? (num2>num3 ? num3 : num2)  : num1;
    }
}
