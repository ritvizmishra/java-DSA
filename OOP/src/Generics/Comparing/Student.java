package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    String name;
    int rollNum;
    float marks;

    public Student(String name, int rollNum, float marks){
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student ritviz = new Student("Ritviz Mishra", 128, 73.06f);
        Student suryansh = new Student("Suryansh Shahi", 103, 86.23f);
        Student param = new Student("Paramjeet Singh", 71, 74.23f);
        Student lucky = new Student("Lakshveer Singh", 55, 80.56f);

        Student[] list = {ritviz, suryansh, param, lucky};
        System.out.println(Arrays.toString(list));

//***********************************************************************************************************************
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks); // add minus sign over here to sort in descending order
            }
        }); // compareTo should be customized

        System.out.println("\nSorted based on marks: " + "\n" + Arrays.toString(list));
//***********************************************************************************************************************
        Arrays.sort(list, (o1, o2) -> (int)(o1.rollNum - o2.rollNum));
        System.out.println("\nRoll Number wise: " + "\n" + Arrays.toString(list));
//***********************************************************************************************************************

        if(ritviz.compareTo(suryansh) < 0){
            System.out.println("\nSuryansh is topper.");
        }
     }

    @Override
    public String toString() {
        return name + " " + rollNum + " " + marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks - o.marks);
    }
}

