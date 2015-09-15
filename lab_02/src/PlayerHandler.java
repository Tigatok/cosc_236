import java.util.ArrayList;

/**
 * Created by Tyler on 9/14/2015.
 */
public class PlayerHandler {
    public static ArrayList<Player> playerHandlerArrayList = new ArrayList<Player>();
    public PlayerHandler(Player playerToHandle){
        System.out.println("Starting Player Handler...");
        playerHandlerArrayList.add(playerToHandle);
    }
}
