import java.util.Scanner;
public class GameRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initial printing + receiving user input
        System.out.println("Welcome to the Game.\n\n front of you lay three doors, labeled 1, 2, and 3.");
        System.out.println("Two of these doors contain a bomb, and will explode upon opening. The other, however, will contain a brand new Lamborghini!");
        System.out.print("Now, which door will you choose? (1, 2, or 3) ");
        int playerChoice = scan.nextInt();




    }
}
