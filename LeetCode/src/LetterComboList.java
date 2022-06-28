//done but not how its required, will come back later






// THIS CODE IS INCORRECT

// import java.util.ArrayList;
//import java.util.List;
//
//public class LetterComboList {
//    public static void main(String[] args) {
//        System.out.println(letterCombinations("23"));
//    }
//    static List<String> letterCombinations(String digits){
//        if(digits.isEmpty()){
//            List<String> ans = new ArrayList<>();
//            ans.add(digits);
//            return ans;
//        }
//        int digit = digits.charAt(0) - '0';
//
//        List<String> one = new ArrayList<>();
//        List<String> two = new ArrayList<>();
//        List<String> three = new ArrayList<>();
//
//        if(digit == 7){
//            for(int i = (digit - 2) * 3; i < (digit * 3) - 2; i++){
//                char ch = (char)('a' + i);
//
//                one = letterCombinations(digits + ch);
//            }
//        }
//        else if(digit == 9){
//            for(int i = ((digit - 2) * 3) + 1; i < (digit * 3) - 1; i++){
//                char ch = (char)('a' + i);
//
//                two = letterCombinations(digits + ch);
//            }
//        }
//
//        else {
//            for (int i = (digit - 2) * 3; i < (digit * 3) - 3; i++) {
//                char ch = (char) ('a' + i);
//
//                three = letterCombinations(digits + ch);
//            }
//        }
//        one.addAll(two);
//        one.addAll(three);
//
//        return one;
//    }
//}
