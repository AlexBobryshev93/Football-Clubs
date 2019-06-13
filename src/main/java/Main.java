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
        clubService.addClub(club);
        Player player = new Player("Prokopenko", 28);
        club.addPlayer(player);
        clubService.updateClub(club);
        System.out.println(player);
        System.out.println(club);
        //playerService.removePlayer(player);
        //playerService.removeAll();
        //clubService.removeClub(club);
        //clubService.removeAll();
    }
}
