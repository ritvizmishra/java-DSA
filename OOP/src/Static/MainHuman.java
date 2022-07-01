package Static;

public class MainHuman {
    public static void main(String[] args) {

//        calling Human class
        Human ritviz = new Human(21, "Ritviz Mishra", 'M', "AB+");
        Human suryansh= new Human(21, "Suryansh Shahi", 'M', "O+");
        Human param = new Human(22, "Paramjeet Singh", 'M', "A+");

        System.out.println(ritviz.age + " " + ritviz.name + " " + ritviz.gender + " " + ritviz.bloodGroup);
        System.out.println(suryansh.age + " " + suryansh.name + " " + suryansh.gender + " " + suryansh.bloodGroup);
        System.out.println(param.age + " " + param.name + " " + param.gender + " " + param.bloodGroup);

        System.out.println("\nTotal existing humans are = " + Human.population);

    }
}
