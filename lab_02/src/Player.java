import java.util.Random;

/**
 * Created by Tyler on 9/14/2015.
 */
public class Player {
    private String playerName, job, playerJob, playerJobLocation;

    private int playerAge;

    private PlayerHandler playerHandler;

    public Player(String playerName, int playerAge, String playerJob, String playerJobLocation){
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerJob = playerJob;
        this.playerJobLocation = playerJobLocation;
        System.out.println("Creating new Player\n" + "Player Name: "+ playerName + "\nPlayer Age: " + playerAge  + "\nPlayer Job: " + playerJob + " at " + playerJobLocation);

        this.playerHandler = new PlayerHandler(this);
    }

    private Player getRandomPlayer(){
        Random random = new Random();
        return PlayerHandler.playerHandlerArrayList.get(random.nextInt());
    }
        public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getJob() {
        return job;
    }
    public PlayerHandler getPlayerHandler() {
        return playerHandler;
    }

    public void setPlayerHandler(PlayerHandler playerHandler) {
        this.playerHandler = playerHandler;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPlayerJob() {
        return playerJob;
    }

    public void setPlayerJob(String playerJob) {
        this.playerJob = playerJob;
    }

    public String getPlayerJobLocation() {
        return playerJobLocation;
    }

    public void setPlayerJobLocation(String playerJobLocation) {
        this.playerJobLocation = playerJobLocation;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }
}
