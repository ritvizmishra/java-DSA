import java.util.List;

//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
// Return the answer in any order.
public class LetterCombination {
    public static void main(String[] args) {
        combination("", "259");

    }
//    static List<String> letterCombinations(String digits){
//
//    }
    static void combination(String strNew, String str){
        if(str.isEmpty()){int digits = str.charAt(0) - '0';

            if(digits == 7){
                for(int i = (digits - 2) * 3; i < (digits * 3) - 2; i++){
                    char ch = (char)('a' + i);

                    combination(strNew + ch, str.substring(1));
                }
            }
            else if(digits == 9){
                for(int i = ((digits - 2) * 3) + 1; i < (digits * 3) - 1; i++){
                    char ch = (char)('a' + i);

                    combination(strNew + ch, str.substring(1));
                }
            }

            else {
                for (int i = (digits - 2) * 3; i < (digits * 3) - 3; i++) {
                    char ch = (char) ('a' + i);

                    combination(strNew + ch, str.substring(1));
                }
            System.out.print(strNew + " ");
            return;
        }

        }
    }

}
