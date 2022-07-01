package Static;

public class Human {
    int age;
    String name;
    char gender;
    String bloodGroup;
    static long population;

//    constructor
    public Human(int age, String name, char gender, String bloodGroup){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        Human.population += 1;
    }

}
