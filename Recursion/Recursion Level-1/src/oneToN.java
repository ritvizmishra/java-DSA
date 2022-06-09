public class oneToN {
    public static void main(String[] args) {
        fun(6);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
}
