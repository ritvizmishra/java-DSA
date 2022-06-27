public class SkipChar {
    public static void main(String[] args) {
        String str = "baccad";
        character(" ", str);
        System.out.println(character("hahkjdhahkjhaba"));
    }
    /* ||substring()||: This method has two variants and returns a new string that is a substring of this string.
    The substring begins with the character at the specified index and extends to the end of this string.
    And index of substring starts from 1 and not from 0.
     */

//    Method 1
    static void character(String strNew, String str){
        if (str.isEmpty()){
            System.out.println(strNew);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            character(strNew, str.substring(1));
        }
        else {
            character(strNew + ch, str.substring(1));
        }
    }

//    Method 2
    static String character(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return character(str.substring(1));
        }
        return ch + character(str.substring(1));
    }
}
