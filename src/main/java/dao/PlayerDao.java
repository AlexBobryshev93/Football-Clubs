package dao;

import models.Player;

public interface PlayerDao {
    void save(Player player);
    void update(Player player);
    void delete(Player player);
    void deleteAll();
}
