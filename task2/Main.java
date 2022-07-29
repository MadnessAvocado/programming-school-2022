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

class Foo {
    public void printElements(List<Integer> list) {
        for (int i = 0; i < list.size(); ++i) {
           System.out.println(list.get(i));
        }
    }

    public void printEvenElements(List<Integer> list) {
        for (int i = 0; i <list.size(); ++i) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }
    }
}
