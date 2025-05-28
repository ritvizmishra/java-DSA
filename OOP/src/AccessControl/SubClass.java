package AccessControl;


//      fprotected
public class SubClass extends Access{
    public SubClass(int num, String str){
        super(num, str);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(2, "hey");
        System.out.println(obj.str);
    }
}
