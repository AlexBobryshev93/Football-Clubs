package dao;

import models.Club;

public interface ClubDao {
    void save(Club club);
    void update(Club club);
    void delete(Club club);
}
