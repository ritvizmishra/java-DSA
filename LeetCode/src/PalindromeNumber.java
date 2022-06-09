import java.util.ArrayList;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(100));

    }
    static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        ArrayList<Integer> arr = digitArray(x);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = arr.size() - 1; i >= 0; i--){
            list.add(arr.get(i));
        }
        if(arr.equals(list)){
            return true;
        }
//        int start = 0;
//        int end = arr.size() - 1;
//        while(start <= end){
//            if(arr.get(start) == arr.get(end)) {
//                return true;
//            }
//            start++;
//            end--;
//        }
        return false;
    }
    static ArrayList<Integer> digitArray(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        return list;
    }
}
