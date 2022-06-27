public class SkipString {
    public static void main(String[] args) {
        System.out.println(character("i am a ritviz boy."));
    }
    static String character(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("ritviz ")){
            return character(str.substring(7));
        }
        return str.charAt(0) + character(str.substring(1));
    }
}
