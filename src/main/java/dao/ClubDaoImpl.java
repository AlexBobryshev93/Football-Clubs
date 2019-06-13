package dao;

import models.Club;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;

import java.util.List;

public class ClubDaoImpl implements ClubDao {
    public void add(Club club) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(club);
        tx.commit();
        session.close();
    }

    public Club getById(Integer id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Club club = session.get(Club.class, id);
        session.close();
        return club;
    }

    public List<Club> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Club> list = (List<Club>) session.createQuery("From Club").list();
        session.close();
        return list;
    }

    public void update(Club club) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(club);
        tx.commit();
        session.close();
    }

    public void updateAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Club> list = (List<Club>) session.createQuery("From Club").list();
        Transaction tx = session.beginTransaction();
        session.update(list);
        tx.commit();
        session.close();
    }

    public void remove(Club club) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(club);
        tx.commit();
        session.close();
    }

    public void removeAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Club> list = (List<Club>) session.createQuery("From Club").list();
        Transaction tx = session.beginTransaction();
        for (Club club : list) session.delete(club);
        tx.commit();
        session.close();
    }
}
