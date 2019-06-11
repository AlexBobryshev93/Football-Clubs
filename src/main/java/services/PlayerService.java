package services;

import dao.PlayerDao;
import dao.PlayerDaoImpl;
import models.Player;

public class PlayerService {
    private PlayerDao playerDao = new PlayerDaoImpl();

    public void savePlayer(Player player) {
        playerDao.save(player);
    }

    public void updatePlayer(Player player) {
        playerDao.update(player);
    }

    public void deletePlayer(Player player) {
        playerDao.delete(player);
    }

    public void deleteAll() {
        playerDao.deleteAll();
    }
}
