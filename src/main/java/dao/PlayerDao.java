package dao;

import models.Player;

import java.util.List;

public interface PlayerDao {
    void add(Player player);
    Player getById(Integer id);
    List<Player> getAll();
    void update(Player player);
    void updateAll();
    void remove(Player player);
    void removeAll();
}
