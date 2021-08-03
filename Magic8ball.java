import java.util.Random;
import java.util.Scanner;

public class Magic8ball {

    public static void main(String[] args) {
        // HI ANDYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY
        System.out.println("What is thy question bitch");
        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random rand = new Random();

        int r = rand.nextInt(5);

        if (r == 0) {
            System.out.println("as i see it, yes");
        } else if (r == 1) {
            System.out.println("bro...no");
        } else if (r == 2) {
            System.out.println("Sure, fuck it");
        } else if (r == 3) {
            System.out.println("meh");
        } else if (r == 4) {
            System.out.println("ask your mother");
        }

    }

}
