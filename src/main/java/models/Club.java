package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<Player> players;

    public Club(String name) {
        this.name = name;
        players = new ArrayList<Player>();
    }

    public Club() {
    }

    public void removePlayer(Player player) {
        player.setClub(null);
        players.remove(player);
    }

    public void addPlayer(Player player) {
        player.setClub(this);
        players.add(player);
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
