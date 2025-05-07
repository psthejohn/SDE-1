import java.util.Scanner;

public class DAY2_EVEN_ODD_RANGE {
    
    private static String is_even_odd(int a, int b){
        if (b<a) return "Invalid Range";
        int count = b-a+1;
        if(count%2==0){
                return "EVEN :: "+count/2+" ODD :: "+count/2;
        }else{
            if(a%2==0) {
                return "EVEN :: "+(1+(count/2))+" ODD :: "+count/2;
            }else{
                return "EVEN :: "+(count/2)+" ODD :: "+(1+(count/2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int from = sc.nextInt();
        System.out.println("Please enter second number : ");
        int to = sc.nextInt();
        
        System.out.println("Number is :: "+ is_even_odd(from,to));
        sc.close();
    }
}
