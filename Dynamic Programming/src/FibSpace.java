public class FibSpace {
    public static void main(String[] args) {
        int n = 5;
        int preOne = 1;
        int preTwo = 0;

        for(int i = 2; i <= n; i++){
            int present = preOne + preTwo;
            preTwo = preOne;
            preOne = present;
        }
        System.out.println(preOne);
    }
}
