public class DAY3_PATTERN2 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
