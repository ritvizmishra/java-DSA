public class SkipChar {
    public static void main(String[] args) {
        String str = "baccad";
        character(str);
        System.out.println(str);
    }
    static void character(String str){
        int i = 0;
        if(str.charAt(i) == str.length()){
            return ;
        }
        if(str.charAt(i) != 'a'){
            str = str.charAt(i) + character(str);
            return;
        }
        str + character(str);
    }
}
