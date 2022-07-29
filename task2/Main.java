import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i < 11; ++i) {
            list.add(i);
        }

        if (false) {
            System.out.println("false");
        } else if (false) {
            System.out.println("else if");
        } else {
            System.out.println("smth");
        }

        System.out.println(4 % 2 == 0);


        Foo foo = new Foo();
        foo.printEvenElements(list);
    }
}
