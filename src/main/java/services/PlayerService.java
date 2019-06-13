package services;

import dao.PlayerDao;
import dao.PlayerDaoImpl;
import models.Player;

import java.util.List;

public class PlayerService {
    private PlayerDao playerDao = new PlayerDaoImpl();

    public void addPlayer(Player player) {
        playerDao.add(player);
    }

    public Player getPlayerById(Integer id) {
        return playerDao.getById(id);
    }

    public List<Player> getAll() {
        return playerDao.getAll();
    }

    public void updatePlayer(Player player) {
        playerDao.update(player);
    }

    public void updateAll() {
        playerDao.updateAll();
    }

    public void removePlayer(Player player) {
        playerDao.remove(player);
    }

    public void removeAll() {
        playerDao.removeAll();
    }
}
