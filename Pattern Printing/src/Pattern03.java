public class Pattern03 {static void pattern(int n){
    for(int row = 0; row <= n; row++){
        for(int col = 1; col <= row; col++){
                System.out.print(col+ " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        pattern(6);
    }
}
