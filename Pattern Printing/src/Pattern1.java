public class Pattern1 {
    static void pattern(int n){
        for(int row = 0; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     pattern(6);
    }
}
