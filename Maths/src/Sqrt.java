public class Sqrt {
    public static void main(String[] args) {
        //System.out.println(Math.sqrt(5));

        System.out.printf("%.3f", sqrt(40, 3));

    }
    static double sqrt(int n, int p){
        int start = 0;
        int end = n;
        double root = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid > n){
                end = mid - 1;
            }
            else{
                start = mid + 1;
                root = mid;
            }
        }
        double precision = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n){
                root += precision;
            }
            root -= precision;
            precision /= 10;
        }
        return root;
    }
}
