public class Euclidean {
    public static void main(String[] args) {
        int a = 105;
        int b = 240;
        System.out.println("GCD: "+ gcd(a, b));
        System.out.println("LCM: "+ lcm(a, b));
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b){
        int lcm = (a*b) / gcd(a, b);
        return lcm;
    }
}
