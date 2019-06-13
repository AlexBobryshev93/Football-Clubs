package services;

import dao.ClubDao;
import dao.ClubDaoImpl;
import models.Club;

public class ClubService {
    private ClubDao clubDao = new ClubDaoImpl();

    public void addClub(Club club) {
        clubDao.add(club);
    }

    public void getClubById(Integer id) {
        clubDao.getById(id);
    }

    public void getAll() {
        clubDao.getAll();
    }

    public void updateClub(Club club) {
        clubDao.update(club);
    }

    public void updateAll() {
        clubDao.updateAll();
    }

    public void removeClub(Club club) {
        clubDao.remove(club);
    }

    public void removeAll() {
        clubDao.removeAll();
    }
}
