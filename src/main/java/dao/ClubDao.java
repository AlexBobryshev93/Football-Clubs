package dao;

import models.Club;

import java.util.List;

public interface ClubDao {
    void add(Club club);
    Club getById(Integer id);
    List<Club> getAll();
    void update(Club club);
    void updateAll();
    void remove(Club club);
    void removeAll();
}
