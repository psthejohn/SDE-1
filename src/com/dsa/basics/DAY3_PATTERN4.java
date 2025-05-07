public class DAY3_PATTERN4 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int n){
        int x = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(++x+" ");
            }
            System.out.println();
        }
    }
}
