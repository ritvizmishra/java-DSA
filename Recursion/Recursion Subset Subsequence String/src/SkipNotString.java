public class SkipNotString {
//    skip a string if its not the required string eg. if app does not form apple skip it
    public static void main(String[] args) {
        System.out.println(character("i am rirtiviz."));
    }
    static String character(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("ri") && !str.startsWith("ritviz")){
            return character(str.substring(2));
        }
        return str.charAt(0) + character(str.substring(1));
    }
}
