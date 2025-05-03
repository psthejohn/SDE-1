public class DAY1_SUM {
    public static void main(String[] args) {
        // DAY1_SUM sum = new DAY1_SUM();
        print(10);
    }
    private static void print(int num){
        // ------------- OPTION 1 --------------
        // for(int i=0; i<num; i++){
        //     System.out.println(i+1);
        // }
        // ------------- OPTION 2 --------------
        int i=1;
        while(i<=num){
            System.out.println(i++);
        }
    }
}