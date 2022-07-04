package Enumerations;

public class Main {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    }

    void Week() {
        System.out.println("Constructor is calling for: " + this);
    }

    public static void main(String[] args) {
        Week day;
        day = Week.Friday;
        System.out.println(day);

        for(Week days : Week.values()){
            System.out.println(days);
        }

    }

}
