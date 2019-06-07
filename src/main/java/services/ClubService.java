package services;

import dao.ClubDao;
import dao.ClubDaoImpl;
import models.Club;

public class ClubService {
    private ClubDao clubDao = new ClubDaoImpl();

    public void saveClub(Club club) {
        clubDao.save(club);
    }

    public void updateClub(Club club) {
        clubDao.update(club);
    }
}
