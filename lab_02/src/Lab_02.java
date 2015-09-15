import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tyler on 9/14/2015.
 */
public class Lab_02 {
    public static void main(String[] lightSabersAreCool) {
        if (PlayerHandler.playerHandlerArrayList.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("No Player's found.\nPlease enter the amount of player's to join:");
            try {
                int numberOfPlayers = scanner.nextInt();
                for (int i = 0; i < numberOfPlayers; i++) {
                    String playerName, playerJob, playerJobLocation;
                    int playerAge;
                    System.out.println("New Player!");

                    System.out.println("Please Enter the Player's Name: ");
                    playerName = scanner.next();

                    System.out.println("Please Enter the Player's Age: ");
                    playerAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Please Enter the Player's Job: ");
                    playerJob = scanner.nextLine();

                    System.out.println("Please Enter the Player's Location of Work: ");
                    playerJobLocation = scanner.nextLine();

                    System.out.println(
                            "Player Info: \n" +
                                    "Name: " + playerName +
                                    "\n-----------\n" +
                                    "Age: " + playerAge + "\n" +
                                    "Job: " + playerJob + "\n" +
                                    "Job Loc.: " + playerJobLocation);
                    new Player(playerName, playerAge, playerJob, playerJobLocation);
                }

            } catch (NumberFormatException | InputMismatchException e) {
                e.printStackTrace();
            }
        }
        Random random = new Random();
        int randomPlayer = random.nextInt(PlayerHandler.playerHandlerArrayList.size())+ 1;
        System.out.println("Rando: " + randomPlayer);
        new Game(PlayerHandler.playerHandlerArrayList.get(0));
    }
}
