package AccessControl;

public class Access {
    private int num;
    protected String str;
    int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public Access(int num, String str){
        this.num = num;
        this.str = str;
        int[] arr = new int[num];
    }
}
