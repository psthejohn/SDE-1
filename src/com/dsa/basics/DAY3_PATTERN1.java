public class DAY3_PATTERN1 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
