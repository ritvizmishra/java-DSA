import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set);

        if(set.contains(3)) System.out.println("yes");
        else System.out.println("no");

        set.remove(5);
        System.out.println(set);

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
