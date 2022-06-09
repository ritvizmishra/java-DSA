public class Concept {
    public static void main(String[] args){
       pass(5);
    }
    static int pass(int n){
        if(n == 0){
            return 0;
        }
        System.out.print(n + " ");
        return pass(--n);
    }
}
