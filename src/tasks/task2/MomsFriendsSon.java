import java.util.Scanner;
public class MomsFriendsSon {
    public void doShopping(){
        boolean bread = this.getAnswerFromConsole("Are there a bread in a market? (Answer 'yes or 'no')");
        boolean eggs = this.getAnswerFromConsole("Are there an eggs in a market? (Answer 'yes' or 'no')");
        boolean milk = this.getAnswerFromConsole("Are there a milk in a market? (Answer 'yes' or 'no')");

        if (bread) {
            System.out.println("Getting bread");
        } else {
            System.out.println("Getting 2 bears");
        }

        if (eggs) {
            System.out.println("Getting 10 eggs");
        }

        if (milk) {
            System.out.println("Getting milk");
        }

    }
    private boolean getAnswerFromConsole(String request) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(request);
        String answer = myObj.nextLine();

        if (answer.equals("yes")) {
            return true;
        }
        else if (answer.equals("no")) {
            return false;
        }
        else {
            System.out.println("Answer should be 'yes' or 'no'!");
            System.exit(1);
            return false;
        }
    }
    public static void main(String[] args) {
        MomsFriendsSon momsFriendsSon = new MomsFriendsSon();
        momsFriendsSon.doShopping();
    }
}
