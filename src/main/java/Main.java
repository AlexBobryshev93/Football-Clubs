import models.Club;
import models.Player;
import services.ClubService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClubService clubService = new ClubService();

        Club club = new Club("Rapid Fire");
        clubService.saveClub(club);
        Player player = new Player("Prokopenko", 28);
        club.addPlayer(player);
        System.out.println(player);
        //clubService.updateClub(club);
        //System.out.println(club);

    }
}
