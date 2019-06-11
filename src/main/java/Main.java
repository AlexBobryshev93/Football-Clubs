import models.Club;
import models.Player;
import services.ClubService;
import services.PlayerService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClubService clubService = new ClubService();
        PlayerService playerService = new PlayerService();

        Club club = new Club("Rapid Fire");
        clubService.saveClub(club);
        Player player = new Player("Prokopenko", 28);
        club.addPlayer(player);
        playerService.savePlayer(player); //should be also saved using PlayerService?
        //System.out.println(player);
        clubService.updateClub(club);
        //System.out.println(club);
        //clubService.deleteClub(club);
        //clubService.deleteAll();

    }
}
