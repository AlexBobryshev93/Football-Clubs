package dao;

import models.Club;
import models.Player;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;

import java.util.List;

public class ClubDaoImpl implements ClubDao {
    public void save(Club club) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(club);
        tx.commit();
        session.close();
    }

    public void update(Club club) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(club);
        tx.commit();
        session.close();
    }

    public void delete(Club club) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(club);
        tx.commit();
        session.close();
    }
}
