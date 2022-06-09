public class nTo1 {
    public static void main(String[] args) {
       fun(6);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }
}
