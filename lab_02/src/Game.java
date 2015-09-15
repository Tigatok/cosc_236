/**
 * Created by Tyler on 9/14/2015.
 */
public class Game {
    private Player playerToPlayGame;
    public Game(Player playerToPlayGame){
        this.playerToPlayGame = playerToPlayGame;
        System.out.println("Player Selected: " + this.playerToPlayGame.getPlayerName());
    }
}
